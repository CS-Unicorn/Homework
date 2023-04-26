package com.advancex.problem02;

public class Test02 {
    public static void main(String[] args) {
        GraphicTools graphicTools = new GraphicTools();

        graphicTools.printRectangle();

        graphicTools.printRectangle(3,3,"￥");

        double triangleArea = graphicTools.getTriangleArea(3, 4);
        System.out.println("triangleArea = " + triangleArea);

        double triangleArea1 = graphicTools.getTriangleArea(3, 4, 5);
        System.out.println("triangleArea1 = " + triangleArea1);
        double triangleArea2 = graphicTools.getTriangleArea(1, 2, 7);
        System.out.println("triangleArea2 = " + triangleArea2);
    }
}
