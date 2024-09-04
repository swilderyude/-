#include <stdio.h>
int z=20,i,j,a;
int main()
{
    int add(int x[z][z],int y[z][z]);
    int minus(int x[z][z],int y[z][z]);
    int multiply(int x[z][z],int y[z][z]);
    printf("输入方阵的阶数：");
    scanf("%d",&z);
    int x[z][z],y[z][z],m[z][z];
    printf("输入a方阵:");
    for(i=0;i<z;i++)
    for(j=0;j<z;j++)
        scanf("%d",&x[i][j]);
    printf("输入b方阵:");
    for(i=0;i<z;i++)
    for(j=0;j<z;j++)
        scanf("%d",&y[i][j]);
    printf("输入指令（0，1，2，3）:");
    scanf("%d",&a);
    switch(a)
    {
        case '1':
        add(x,y);
        case '2':
        minus(x,y);
        case '3':
        multiply(x,y);
        case '0':
        break;
    }
    printf("得到的方阵为:");
    for(i=0;i<z;i++)
    for(j=0;j<z;j++)
        printf("%d",m[i][j]);
}
int add(int x[z][z],int y[z][z])
{
    int m[z][z];
   for(i=0;i<z;i++)
    for(j=0;j<z;j++)
    m[i][j]=x[i][j]+y[i][j];
    return 0;
}
int minus(int x[z][z],int y[z][z])
{
   int m[z][z];
   for(i=0;i<z;i++)
    for(j=0;j<z;j++)
    m[i][j]=x[i][j]-y[i][j];
    return 0;
}
int multiply(int x[z][z],int y[z][z])
{
  int m[z][z];
   for(i=0;i<z;i++)
    for(j=0;j<z;j++)
    m[i][j]+=x[i][j]*y[j][i]; 
    return 0;
}
