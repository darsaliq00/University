// to find the transpose of a matrix

#include <stdio.h>

int main(){
	int i, j, m,n;
	int arr[100][100];
	int transpose[100][100];
	printf("Enter the number of Rows: ");
	scanf("%d", &m);
	printf("Enter the number of columns: ");
	scanf("%d", &n);
	
	for(i = 0; i < m; i++){
		for(j = 0; j < n;j++){
			printf("Enter the element at [%d][%d]: ", i+1, j+1);
			scanf("%d", &arr[i][j]);
		}
	}
	
	for(i = 0; i < m; i++){
		for(j = 0 ; j < n;j++){
			transpose[i][j] = arr[j][i];
		}
	}
	
	for(i = 0; i < m ;i++){
		for(j = 0; j < n; j++){
			printf("%d  ", transpose[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}
