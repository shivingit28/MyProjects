  /*
   Creator:- Shiv Pratap Singh(iit2015502@iiita.ac.in)
  */
/*
 * port_scanner.c
 * ########################################################################################
 * Enter an IP address and a port range where the program will then attempt to find open
 * ports on the given computer by connecting to each of them. On any successful connections
 * ports mark the port as open.
 */

#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <string.h>

void port_scanner (char* tIP, char* start_port, char* end_port)
{

	int s_port = atoi(start_port);	// Start port
	int e_port = atoi(end_port);		// End port

	int port=0;
	for (port = s_port; port <= e_port; port++)
	{
		struct addrinfo hints;
		memset(&hints, 0, sizeof(hints));
		hints.ai_family = AF_INET;
		hints.ai_socktype = SOCK_STREAM;

		struct addrinfo *serv_addr=NULL;
		char tport[6]={0};
		sprintf(tport, "%d", port);		// Converts the int to char* type

		// Even service name can also be used in place of tport.
		if(getaddrinfo(tIP, tport, &hints, &serv_addr)==0)
		{
			struct addrinfo *temp=NULL;
			int sockfd=0;
			char status=0;
			for(temp= serv_addr; temp != NULL; temp = temp->ai_next)
			{
				sockfd = socket(temp->ai_family, temp->ai_socktype, temp->ai_protocol);		// Creating a socket
				if (sockfd < 0) {				// If socket creation fails.
					printf("Port %d is NOT open.\n", port);
					continue;
				}

				status = connect(sockfd, temp->ai_addr, temp->ai_addrlen);		// Try connecting to the socket
				if (status<0) {			// If connection to socket fails
					printf("Port %d is NOT open.\n", port);
					close(sockfd);
					continue;
				}

				printf("Port %d is open.\n", port);			// If we create a socket and successfully connect to it.
				close(sockfd);
			}
			freeaddrinfo(serv_addr);	// Frees on instance in the list returned by getaddrinfo.
		}
		else
		{
			freeaddrinfo(serv_addr);
			printf("Port %d is NOT open.\n", port);
		}
	}
}

int main(int argc, char *argv[])
{
	if (argc<4) {
		printf ("please enter the server IP address and range of ports to be scanned\n");
		printf ("USAGE: %s IPv4 First_Port Last_Port\n",argv[0]);
		exit(1);
	}
	char tIP[16]={0};
	strcpy(tIP, argv[1]);    // Copy the IPv4 address

	char First_Port[6]={0};
	strcpy(First_Port, argv[2]);   // Copy the start_port

  char Last_Port[6]={0};
	strcpy(Last_Port, argv[3]);    // Copy the end_port

	// Start port-scanner
	port_scanner(tIP,First_Port,Last_Port);

	return 0;
}
