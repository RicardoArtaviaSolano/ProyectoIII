package API;

public class grafoPOJO {

    private int matrixEnableRoads[][];
    private int matrixLenghtRoads[][];
    private int roadMatrix[][];
    private int matrixLenghtRoads2[][];
    private Lista route;
    private Lista list;

    public grafoPOJO(){
    }

    public int[][] getMatrixEnableRoads() {
        return matrixEnableRoads;
    }

    public void setMatrixEnableRoads(int[][] matrixEnableRoads) {
        this.matrixEnableRoads = matrixEnableRoads;
    }

    public int[][] getMatrixLenghtRoads() {
        return matrixLenghtRoads;
    }

    public void setMatrixLenghtRoads(int[][] matrixLenghtRoads) {
        this.matrixLenghtRoads = matrixLenghtRoads;
    }

    public int[][] getRoadMatrix() {
        return roadMatrix;
    }

    public void setRoadMatrix(int[][] roadMatrix) {
        this.roadMatrix = roadMatrix;
    }

    public int[][] getMatrixLenghtRoads2() {
        return matrixLenghtRoads2;
    }

    public void setMatrixLenghtRoads2(int[][] matrixLenghtRoads2) {
        this.matrixLenghtRoads2 = matrixLenghtRoads2;
    }

    public Lista getRoute() {
        return route;
    }

    public void setRoute(Lista route) {
        this.route = route;
    }

    public Lista getList() {
        return list;
    }

    public void setList(Lista list) {
        this.list = list;
    }
}
