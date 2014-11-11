package Trains;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Routes graph = new Routes();

        Town  a = new Town("A");
        Town  b = new Town("B");
        Town  c = new Town("C");
        Town  d = new Town("D");
        Town  e = new Town("E");


      /*  Adjacency List

          A | {B,5}, {D,5}, {E,7}
          B | {C,4}
          C | {D,8}, {E,2}
          D | {C,8}, {E,6}
          E | {B,3}

      Created in code below.
      */
        graph.routingTable.put(a, new Edge(a,b,5).next(new Edge(a,d,5).next(new Edge(a,e,7))));
        graph.routingTable.put(b, new Edge(b,c,4));
        graph.routingTable.put(c, new Edge(c,d,8).next(new Edge(c,e,2)));
        graph.routingTable.put(d, new Edge(d,c,8).next(new Edge(d,e,6)));
        graph.routingTable.put(e, new Edge(e,b,3));

        // }
        //1. Distance of route A-B-C
        ArrayList<Town> routes1 = new ArrayList<Town>();
        routes1.add(a);
        routes1.add(b);
        routes1.add(c);
//        System.out.println("Output#1  " + graph.findDistanceBetweenTowns(routes1));

        //2. Distance of route A-D
        ArrayList<Town> routes2 = new ArrayList<Town>();
        routes2.add(a);
        routes2.add(d);
//        System.out.println("Output#2  " + graph.findDistanceBetweenTowns(routes2));

        //3. Distance of route A-D-C
        ArrayList<Town> routes3 = new ArrayList<Town>();
        routes3.add(a);
        routes3.add(d);
        routes3.add(c);
//        System.out.println("Output#3  " + graph.findDistanceBetweenTowns(routes3));

        //4. Distance of route A-E-B-C-D
        ArrayList<Town> routes4 = new ArrayList<Town>();
        routes4.add(a);
        routes4.add(e);
        routes4.add(b);
        routes4.add(c);
        routes4.add(d);

//        System.out.println("Output#4  " + graph.findDistanceBetweenTowns(routes4));

        //5. Distance of route A-E-D
        ArrayList<Town> routes5 = new ArrayList<Town>();
        routes5.add(a);
        routes5.add(e);
        routes5.add(d);
//        System.out.println("Output#5  " + graph.findDistanceBetweenTowns(routes5));

        //6. Number of trips starting at C,ending at C with 3 stops max
        System.out.println("Output#6  " + graph.numberOfStopsBetweenTowns(c,c,3));

        //7. Number of trips starting at A,ending at C with 4 stops max
        System.out.println("Output#7  " + graph.numberOfStopsBetweenTowns(a,c,4));

        //8.The length of the shortest route from A to C.
        System.out.println("Output#8  " + graph.shortestRouteBetweenTowns(a,c));

        //9.The length of the shortest route from B to B.

        System.out.println("Output#9  " + graph.shortestRouteBetweenTowns(b,b));

        //10.The number of different routes from C to C with a distance of less than 30
        System.out.println("Output#10  " + graph.numRoutesWithin(c,c,30));

        //Extension 1.




        System.out.println("Output#11   " + graph.calculateTotalTimeForRoute(routes1));

        System.out.println("Output#14   " + graph.calculateTotalTimeForRoute(routes4));

        System.out.println("Output#15   " + graph.calculateTotalTimeForRoute(routes5));

    }
}
