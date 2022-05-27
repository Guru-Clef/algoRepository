package gson;

/**
 *
 * @author jhuaman
 */
public class MensajeWs {

    private boolean Success;//success
    private String Message;//message
    private int Codigo;//codigo

    public boolean getSuccess() {
        return Success;
    }

    public void setSuccess(boolean success) {
        this.Success = success;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        this.Message = message;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    @Override
    public String toString() {
        return "MensajeWs{" + "Success=" + Success + ", Message=" + Message + ", Codigo=" + Codigo + '}';
    }
    
    
}
