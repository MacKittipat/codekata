package com.mackittipat.codekata.codehew2016.final1;

import java.util.ArrayList;
import java.util.List;

public class Final1Cluster {

    public int clusterSize(List<Coordinate> inputCoordinateList) {

        int size = 0;
        List<Coordinate> resultCoordinateList;

        for(Coordinate inputCoordinate : inputCoordinateList) {
            System.out.println("Calculating neighbor size for " + inputCoordinate.toString());
            resultCoordinateList = new ArrayList<>();
            clusterSize(inputCoordinate, inputCoordinateList, resultCoordinateList);
            for(Coordinate resultCoordinate : resultCoordinateList) {
                System.out.println(resultCoordinate);
            }
            if(resultCoordinateList.size() > size) {
                size = resultCoordinateList.size();
            }
            System.out.println("==================================================");
        }

        return size;
    }

    private void clusterSize(Coordinate coordinate,
                             List<Coordinate> coordinateList,
                             List<Coordinate> resultCoordinateList) {

        boolean stop = false;

        while (!stop) {
            List<Coordinate> neighborCoordinateList = findNeighbor(coordinate, coordinateList);
            boolean allNeighborInResultList = true;
            for(Coordinate neighborCoordinate : neighborCoordinateList) {
                if(!isCoordinateInList(neighborCoordinate, resultCoordinateList)) {
                    resultCoordinateList.add(neighborCoordinate);
                    allNeighborInResultList = false;
                    clusterSize(neighborCoordinate, coordinateList, resultCoordinateList);
                    break;
                } else {
                    continue;
                }
            }
            if(allNeighborInResultList) {
                stop = true;
            }
        }
    }

    private List<Coordinate> findNeighbor(Coordinate coordinate,
                                         List<Coordinate> coordinateList) {

//        System.out.println("Finding neighbor for " + coordinate.toString());

        List<Coordinate> neighborCoordinateList = new ArrayList<>();

        Coordinate coordinateNorth = new Coordinate(coordinate.getX(), coordinate.getY() - 1);
        if(isCoordinateInList(coordinateNorth, coordinateList)) {
            neighborCoordinateList.add(coordinateNorth);
//            System.out.println("North neighbor = " + coordinateNorth.toString());
        }
        Coordinate coordinateEast = new Coordinate(coordinate.getX() + 1, coordinate.getY());
        if(isCoordinateInList(coordinateEast, coordinateList)) {
            neighborCoordinateList.add(coordinateEast);
//            System.out.println("East neighbor = " + coordinateEast.toString());
        }
        Coordinate coordinateSouth = new Coordinate(coordinate.getX(), coordinate.getY() + 1);
        if(isCoordinateInList(coordinateSouth, coordinateList)) {
            neighborCoordinateList.add(coordinateSouth);
//            System.out.println("South neighbor = " + coordinateSouth.toString());
        }
        Coordinate coordinateWest = new Coordinate(coordinate.getX() - 1, coordinate.getY());
        if(isCoordinateInList(coordinateWest, coordinateList)) {
            neighborCoordinateList.add(coordinateWest);
//            System.out.println("West neighbor = " + coordinateWest.toString());
        }

        return neighborCoordinateList;
    }

    private boolean isCoordinateInList(Coordinate coordinate,
                                       List<Coordinate> coordinateList) {

        for(Coordinate coOrd : coordinateList) {
            if(coordinate.getX() == coOrd.getX() && coordinate.getY() == coOrd.getY()) {
                return true;
            }
        }

        return false;
    }
}
