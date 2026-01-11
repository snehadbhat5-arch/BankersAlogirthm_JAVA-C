#include <stdio.h>

int main() {
    int P = 5, R = 3;
    int alloc[5][3] = {
        {0,1,0},
        {2,0,0},
        {3,0,2},
        {2,1,1},
        {0,0,2}
    };

    int max[5][3] = {
        {7,5,3},
        {3,2,2},
        {9,0,2},
        {2,2,2},
        {4,3,3}
    };

    int avail[3] = {3,3,2};
    int need[5][3];
    int finish[5] = {0};
    int safe[5];

    // Calculate Need matrix
    for(int i=0;i<P;i++)
        for(int j=0;j<R;j++)
            need[i][j] = max[i][j] - alloc[i][j];

    int count = 0;

    while(count < P) {
        int found = 0;
        for(int i=0;i<P;i++) {
            if(!finish[i]) {
                int j;
                for(j=0;j<R;j++) {
                    if(need[i][j] > avail[j])
                        break;
                }

                if(j == R) {
                    for(int k=0;k<R;k++)
                        avail[k] += alloc[i][k];

                    safe[count++] = i;
                    finish[i] = 1;
                    found = 1;
                }
            }
        }
        if(!found)
            break;
    }

    if(count == P) {
        printf("System is in SAFE state\n");
        printf("Safe Sequence: ");
        for(int i=0;i<P;i++)
            printf("P%d ", safe[i]);
        printf("\n");
    } else {
        printf("System is NOT in safe state\n");
    }

    return 0;
}