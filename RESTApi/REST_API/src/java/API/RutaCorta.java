package API;


import carpool.ConsumirREST.SubRoute;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("ruta")
public class RutaCorta {

    /**
     * @param route array with the 2 locations
     * @return an array with the path to follow
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public SubRoute createRoute(SubRoute route){
        ArrayList<Integer> arrayList = route.getArrayList();
        int a = arrayList.get(0);
        int b = arrayList.get(1);
        if (a == b){
            arrayList.clear();
            arrayList.add(-1);
            route.setArrayList(arrayList);
            return route;
        }else{
            arrayList = Grafo.createRoute(a, b, enviaGrafo.holder.getRoadMatrix());
            if (arrayList.size() == 2){
                a = arrayList.get(0);
                b = arrayList.get(1);
                if (Grafo.checkRoad(a, b, enviaGrafo.holder.getMatrixEnableRoads())){
                    route.setArrayList(arrayList);
                    return route;
                }else{
                    arrayList.clear();
                    arrayList.add(-1);
                    route.setArrayList(arrayList);
                    return route;
                }
            }else{
                route.setArrayList(arrayList);
                return route;
            }
        }
    }

}
