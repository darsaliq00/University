// to find the length of the string without using libraries

#include <stdio.h>
int main(){
	char str[100];
	printf("Enter String: ");
	gets(str);
	
	int i = 0;
	int count = 0;
	while(str[i] != '\0'){
		if(str[i] == ' '){
			i++;
			continue;
		}
		count++;
		i++;
	}
	
	printf("Size of the string is : %d\n", count);
	
	return 0;
}
