package assignmentBuoi12;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        News n = new News();

        System.out.println("ID: ");
        n.setId(sc.nextInt());
        System.out.print("Title: ");
        n.setTitle(sc.nextLine());
        n.setTitle(sc.nextLine());
        System.out.print("Publish Date: ");
        n.setPublishDate(sc.nextLine());
        System.out.println("Author: ");
        n.setAuthor(sc.nextLine());
        System.out.println("Content: ");
        n.setContent(sc.nextLine());

        for (int i = 0; i < n.RateList.length; i++) {
            System.out.print("Nhập vào giá trị cho phần tử thứ "+(i+1)+": ");
            n.RateList[i] = sc.nextInt();
        }

        sc.close();
        n.Display();
        n.Calculate();
    }
}
