package com.yyds.unit2.demo;
import java.util.Scanner;
public class choices_of_life {
   public static void main(String[] args) {
     System.out.println("人生的选择有许多种，同学们，你准备好了吗？");
     System.out.println("下面我们来做一个人生选择的游戏，从下面9样人生特质中，请你挑选1样对你来说最重要的特质，并简要说明理由！");                  
System.out.println("*******************************");
     System.out.println("[1]智商\t"+"[2]情商\t"+"[3]才华\t"+"[4]颜值\t"+"[5]健康\t"+"[6]自信\t"+"[7]勇气\t"+"[8]乐观\t"+"[9]诚实");
System.out.println("*******************************");
     Scanner input = new Scanner(System.in);
     System.out.println("请你输入1-9之间的一个整数来选择你认为应具备的最重要的1项人生特质：");
     int choosenumber = input.nextInt();
     if (choosenumber == 1) {
            System.out.println("[1]智商");
     } else if (choosenumber == 2) {
            System.out.println("[2]情商");
     } else if (choosenumber == 3) {
            System.out.println("[3]才华");
     } else if (choosenumber == 4) {
            System.out.println("[4]颜值");
     } else if (choosenumber == 5) {
            System.out.println("[5]健康");
     } else if (choosenumber == 6) {
            System.out.println("[6]自信");
     } else if (choosenumber == 7) {
             System.out.println("[7]勇气");
     } else if (choosenumber == 8) {
             System.out.println("[8]乐观");
     } else if (choosenumber == 9) {
             System.out.println("[9]诚实");
     } else {
             System.out.println("你所输入的数字有误，请重新运行程序，并输入1-9之间的1个整数以重新选择！");
     }
     System.out.println("你已经挑选了对你来说最重要的1样特质，请说明所选择的理由！");
     System.out.println("***下面介绍另一种选择语句***");
     System.out.println("下面我们来做一个职业选择的意向调研，从下面8项职业选项中，请挑选你未来意向的职业！");
     System.out.println("职业选择：");
     System.out.println("[1]人民教师\t"+ "[2]医生\t" + "[3]公务员\t" + "[4]科学家\t" + "[5]人民警察\t" + "[6]法官\t");
     System.out.println("[7]其他，请说出你的意向职业\t" + "[8]目前还不确定所要从事的职业");
     System.out.println("请输入1-8之间的一个整数来选择你未来意向的理想职业：");
       int choosenumber2 = input.nextInt();
       switch (choosenumber2) {
            case 1:
                System.out.println("你所选择的职业是：人民教师");
                break;
            case 2:
                System.out.println("你所选择的职业是：医生");
                break;
            case 3:
                System.out.println("你所选择的职业是：公务员");
                break;
            case 4:
                System.out.println("你所选择的职业是：科学家");
                break;
            case 5:
                System.out.println("你所选择的职业是：人民警察");
                break;
            case 6:
                System.out.println("你所选择的职业是：法官");
                break;
            case 7:
                System.out.println("其他，请说出你的意向职业");
                break;
            case 8:
                System.out.println("目前还不确定所要从事的职业");
                break;
            default:
                System.out.println("你所输入的数字有误，请重新运行程序，并输入1-8之间的1个整数以重新选择！");
                break;
        }
        System.out.println("请你简要说明所选择该职业的理由！");
        input.close();
    }
}