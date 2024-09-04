#include <stdio.h>
#include <time.h>
#include <math.h>
clock_t start,stop;
double duration;
#define MAX 101
double f1(int n,double a[],double x);
double f2(int n,double a[],double x);
int main()
{
    int i;
    double a[MAX];
    for (i=0;i<MAX;i++)
    a[i]=(double)i;

    start=clock();
    f1(MAX-1,a,1.1);
    stop=clock();
    duration=((double)(stop-start))/CLOCKS_PER_SEC;
    printf("ticks1=%f\n",(double)(stop-start));
    printf("duration=%6.2e\n",duration);
    printf("f(1.1)=%f\n",f1(MAX-1,a,1.1));

    start=clock();
    f2(MAX-1,a,1.1);
    stop=clock();
    duration=((double)(stop-start))/CLOCKS_PER_SEC;
    printf("ticks2=%f\n",(double)(stop-start));
    printf("duration=%6.2e\n",duration);
    printf("f(1.1)=%f\n",f2(MAX-1,a,1.1));

    return 0;

}
double f1(int n,double a[],double x)
{
    int i;
    double p=a[0];
    for(i=1;i<=n;i++)
        p+=(1/a[i]*pow(x,i));
    p=p+1;
    return p;
}
double f2(int n,double a[],double x)
{
    int i;
    double p=1/a[n];
    for(i=n;i>1;i--)
        p=1/a[i-1]+x*p;
    p=1+x*p;
    return p;
}