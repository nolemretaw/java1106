package com.tt.newcoder;

public class B
{
    public static B t1 = new B();
    public static B t2 = new B();
    {
        System.out.println("�����");
    }
    static
    {
        System.out.println("��̬��");
    }
    public static void main(String[] args)
    {
        B t = new B();
        System.out.println(Math.round(-11.5));
    }
}