package gson;

public class JsonConverter {

  public static void main(String args[]) {

    String data = "{\"Codigo\":1,\"Success\":true,\"Message\":\"{\\\"a\\\":\\\"21\\\",\\\"b\\\":\\\"eN2ZY7b4PD9JD9x0\\\",\\\"c\\\":\\\"kDG#<!]j=*H5+hhH\\\",\\\"d\\\":1,\\\"e\\\":\\\"BTULK23qe#fSPbvQ_\\\",\\\"f\\\":\\\"wnbmVwiXrA7jY-qb\\\",\\\"g\\\":\\\"1Yg9#k_9<=OsG,6_\\\",\\\"l\\\":[{\\\"e\\\":\\\"04\\\",\\\"n\\\":\\\"ELECCIONES MUNICIPALES COMPLEMENTARIAS 2021\\\"},{\\\"e\\\":\\\"07\\\",\\\"n\\\":\\\"CONSULTA POPULAR DE REVOCATORIA 2021\\\"}]}\"}";

    MensajeWs objMensaje = GsonManager.getJsonToObject(data, MensajeWs.class);

    System.out.println(objMensaje.toString());

  }

}
