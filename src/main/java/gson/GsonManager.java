package gson;

import com.google.gson.GsonBuilder;

public class GsonManager {

//    public static String getObjectToJson(Object object) {
//        String result = ValueConstant.EMPTY_STRING;
//        try {
//            result = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create().toJson(object);
//        } catch (Exception e) {
//            System.err.println(" > Error >> : " + e.getMessage());
//        }
//        return result;
//    }
//
//    public static String getObjectToJsonEncrypt(Object object, String key) {
//        String result = ValueConstant.EMPTY_STRING;
//        try {
//            String cadena = getObjectToJson(object);
//            result = URLEncoder.encode(Crypto.encryptyText(cadena, key), StandardCharsets.UTF_8.name());
//        } catch (Exception e) {
//            System.err.println(" > Error >> : " + e.getMessage());
//        }
//        return result;
//    }
//
//    public static <T> void insertar(List<T> lista, String pathFileName) {
//        final String json = getObjectToJson(lista);
//        try {
//            // encriptar json
//            if (ValueConstant.SACTIVE) {
//                FileControl.writeFile(pathFileName, Crypto.encryptyText(json, JelSecurity.MASTER_KEY_CONTENT_SEA()));
//            } else {
//                Crypto c = Crypto.getInstance(JelSecurity.MASTER_KEY_CONTENT_VEP());
//                FileControl.writeFile(pathFileName, URLEncoder
//                    .encode(c.encrypt(json), StandardCharsets.UTF_8.name()));
//            }
//        } catch (Exception e) {
//            System.err.println(" > Error >> : " + e.getMessage());
//        }
//    }

  public static <T> T getJsonToObject(String json, Class<T> classOfT) {
    return (T) new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create()
        .fromJson(json, classOfT);
  }

//    public static <T> T getJsonToObjectTrama(String pathFileName, Class<T> classOfT) {
//        try {
//            final String result = FileControl.readFile(pathFileName);
//            return (T) new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create().fromJson(decrypt(result), classOfT);
//        } catch (Exception e) {
//            System.err.println(" > Error >> : " + e.getMessage());
//        }
//        return null;
//    }

//    public static <T> List<T> getJsonToListObject(
//        String pathFileName, Class<T> classOfT) throws Exception {
//        GsonBuilder gson = new GsonBuilder();
//        List<T> listOfT = new ArrayList<>();
//        JsonParser parser = new JsonParser();
//        try {
//            final String result = FileControl.readFile(pathFileName);
//            JsonArray array = parser.parse(decrypt(result)).getAsJsonArray();
//            gson.setDateFormat("yyyy-MM-dd hh:mm:ss");
//
//            for (JsonElement element : array) {
//                listOfT.add(gson.create().fromJson(element, classOfT));
//            }
//            return listOfT;
//        } catch (Exception e) {
//            throw new Exception(Message.C_TRANS_ERROR_READ);
//        }
//    }
//
//    public static <T> List<T> getJsonToListObjectQR(
//        String cadena, Class<T> classOfT) throws Exception {
//        GsonBuilder gson = new GsonBuilder();
//        List<T> listOfT = new ArrayList<>();
//        JsonParser parser = new JsonParser();
//        try {
//            JsonArray array = parser.parse(decrypt(cadena)).getAsJsonArray();
//            gson.setDateFormat("yyyy-MM-dd hh:mm:ss");
//            for (JsonElement element : array) {
//                listOfT.add(gson.create().fromJson(element, classOfT));
//            }
//            return listOfT;
//        } catch (Exception e) {
//            throw new Exception(Message.C_TRANS_ERROR_READ);
//        }
//    }
//
//    public static String decrypt(String cadena) {
//        String data = ValueConstant.EMPTY_STRING;
//        try {
//            if (ValueConstant.SACTIVE) {
//                data = Crypto.desencryptyText(cadena, JelSecurity.MASTER_KEY_CONTENT_SEA());
//            } else {
//                Crypto c = Crypto.getInstance(JelSecurity.MASTER_KEY_CONTENT_VEP());
//                data = c.decrypt(URLDecoder.decode(cadena, StandardCharsets.UTF_8.name()));
//            }
//        } catch (Exception e) {
//            System.err.println(" > Error decrypt >> : " + e.getMessage());
//        }
//        return data;
//    }

}
