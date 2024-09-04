#include <stdio.h>
int main()
{
    int d, m, y, a, b;
    printf("请输入具体日期：");
    scanf("%d年%d月%d日", &y, &m, &d);
    switch (m)
    {
    case 1:
       {a = (d + 4) % 7;
        b = d;
        break;
       }

    case 2:

        {a = (d + 4 + 3) % 7;
        b = (d + 28 * (m - 1) + 3);
        break;
        }

    case 3:

        {a = (d + 4 + 3) % 7;
        b = (d + 28 * (m - 1) + 3);
        break;
        }

    case 4:

        {a = (d + 4 + 6) % 7;
        b = (d + 28 * (m - 1) + 6);
        break;
        }

    case 5:

        {a = (d + 4 + 8) % 7;
        b = (d + 28 * (m - 1) + 8);
        break;
        }

    case 6:

        {a = (d + 4 + 11) % 7;
        b = (d + 28 * (m - 1) + 11);
        break;
        }

    case 7:

        {a = (d + 4 + 13) % 7;
        b = (d + 28 * (m - 1) + 13);
        break;
        }

    case 8:

        {a = (d + 4 + 16) % 7;
        b = (d + 28 * (m - 1) + 16);
        break;
        }

    case 9:

        {a = (d + 4 + 19) % 7;
        b = (d + 28 * (m - 1) + 19);
        break;
        }

    case 10:

        {a = (d + 4 + 21) % 7;
        b = (d + 28 * (m - 1) + 21);
        break;
        }

    case 11:

        {a = (d + 4 + 24) % 7;
        b = (d + 28 * (m - 1) + 24);
        break;
        }

    case 12:

        {a = (d + 4 + 26) % 7;
        b = (d + 28 * (m - 1) + 26);
        break;
        }
    }
    printf("%d月%d日是2021年的第%d天，",m,d,b);
        switch (a)
        {
        case 0:
            printf("星期日");
            break;
        case 1:
            printf("星期一");
            break;
        case 2:
            printf("星期二");
            break;
        case 3:
            printf("星期三");
            break;
        case 4:
            printf("星期四");
            break;
        case 5:
            printf("星期五");
            break;
        case 6:
            printf("星期六");
            break;
        }
    }
