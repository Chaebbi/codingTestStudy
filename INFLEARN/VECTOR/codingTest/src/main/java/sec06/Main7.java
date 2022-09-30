package sec06;

import java.util.*;

// 좌표 정렬 :
// point라는 클래스 개체를 정렬하는 클래스 생성
// 외워서 하기! ==> 좌표정렬이라면 이렇게 한다.  implements Comparable<Point>, compareTo() Override

class Point implements Comparable<Point>{
    public int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        // 오름차순 : this-object 해서 return 하면 음수로 return 되도록
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;

        // 내림차순 하고 싶으면
        /*if(this.x == o.x) return o.y - this.y;
        else return o.x - this.x;*/
    }

}
public class Main7 {

    public static void main(String[] args){
        Main7 T = new Main7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x + " "+ o.y);
    }
}
