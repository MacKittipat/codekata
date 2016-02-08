package com.mackittipat.codekata.codehew2016.final1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Final1ClusterTest {
    @Test
    public void testClusterSize() {
        Final1Cluster final1Cluster = new Final1Cluster();

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(new Coordinate(1, 0));
        coordinateList.add(new Coordinate(2, 0));
        coordinateList.add(new Coordinate(0, 1));
        coordinateList.add(new Coordinate(1, 1));
        coordinateList.add(new Coordinate(2, 1));
        coordinateList.add(new Coordinate(4, 1));
        coordinateList.add(new Coordinate(4, 2));

        int result = final1Cluster.clusterSize(coordinateList);

        Assert.assertEquals(5, result);
    }

    @Test
    public void testClusterSize2() {
        Final1Cluster final1Cluster = new Final1Cluster();

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(new Coordinate(2, 0));
        coordinateList.add(new Coordinate(0, 1));
        coordinateList.add(new Coordinate(1, 1));
        coordinateList.add(new Coordinate(2, 1));
        coordinateList.add(new Coordinate(4, 1));
        coordinateList.add(new Coordinate(4, 2));

        int result = final1Cluster.clusterSize(coordinateList);

        Assert.assertEquals(4, result);
    }

    @Test
    public void testClusterSize3() {
        Final1Cluster final1Cluster = new Final1Cluster();

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(new Coordinate(2, 1));
        coordinateList.add(new Coordinate(4, 1));
        coordinateList.add(new Coordinate(4, 2));

        int result = final1Cluster.clusterSize(coordinateList);

        Assert.assertEquals(2, result);
    }

    @Test
    public void testClusterSize4() {
        Final1Cluster final1Cluster = new Final1Cluster();

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(new Coordinate(0, 3));
        coordinateList.add(new Coordinate(1, 1));
        coordinateList.add(new Coordinate(1, 2));
        coordinateList.add(new Coordinate(1, 4));
        coordinateList.add(new Coordinate(1, 5));
        coordinateList.add(new Coordinate(1, 6));
        coordinateList.add(new Coordinate(1, 8));
        coordinateList.add(new Coordinate(2, 1));

        int result = final1Cluster.clusterSize(coordinateList);

        Assert.assertEquals(3, result);
    }

    @Test
    public void testClusterSize5() {
        Final1Cluster final1Cluster = new Final1Cluster();

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(new Coordinate(0, 3));
        coordinateList.add(new Coordinate(1, 1));
        coordinateList.add(new Coordinate(1, 2));
        coordinateList.add(new Coordinate(1, 3));
        coordinateList.add(new Coordinate(1, 4));
        coordinateList.add(new Coordinate(1, 5));
        coordinateList.add(new Coordinate(1, 6));
        coordinateList.add(new Coordinate(1, 8));
        coordinateList.add(new Coordinate(2, 1));

        int result = final1Cluster.clusterSize(coordinateList);

        Assert.assertEquals(8, result);
    }

    @Test
    public void testClusterSize6() {
        Final1Cluster final1Cluster = new Final1Cluster();

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(new Coordinate(0,0));
        coordinateList.add(new Coordinate(0,1));
        coordinateList.add(new Coordinate(0,3));
        coordinateList.add(new Coordinate(0,4));
        coordinateList.add(new Coordinate(0,5));
        coordinateList.add(new Coordinate(0,6));
        coordinateList.add(new Coordinate(1,2));
        coordinateList.add(new Coordinate(1,5));
        coordinateList.add(new Coordinate(2,0));
        coordinateList.add(new Coordinate(2,1));
        coordinateList.add(new Coordinate(2,4));
        coordinateList.add(new Coordinate(2,5));
        coordinateList.add(new Coordinate(3,0));
        coordinateList.add(new Coordinate(3,3));
        coordinateList.add(new Coordinate(3,5));

        int result = final1Cluster.clusterSize(coordinateList);

        Assert.assertEquals(8, result);
    }

    @Test
    public void testClusterSize7() {
        Final1Cluster final1Cluster = new Final1Cluster();

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(new Coordinate(1,1));
        coordinateList.add(new Coordinate(2,1));
        coordinateList.add(new Coordinate(2,2));
        coordinateList.add(new Coordinate(1,2));
        coordinateList.add(new Coordinate(5,6));
        coordinateList.add(new Coordinate(5,7));
        coordinateList.add(new Coordinate(5,8));
        coordinateList.add(new Coordinate(5,2));

        int result = final1Cluster.clusterSize(coordinateList);

        Assert.assertEquals(4, result);
    }
}