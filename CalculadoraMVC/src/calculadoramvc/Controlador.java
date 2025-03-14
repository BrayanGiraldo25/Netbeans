package calculadoramvc;

/*
 * @author Desarrollo
 */
public class Controlador {
    // Confluyen el modelo con la vista
    Modelo modelo;
    Vista vista;
    // Generar el constructor de esta clase

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // Metodos para sumar, restar y multiplicar que invocan los metodos
    // para sumar, restar y multiplicar el modelo
    
    public void doAdd(){
        // Tomar los valores ingresados en el formulario
        int Value1 = vista.getValue1();
        int Value2 = vista.getValue2();
        // Invocar el metodo
        int Result = modelo.Add(Value1,Value2);
        // Invocar el metodo setResultado para mostrar este resultado
        vista.setResult(Result);
    }
    public void doRest(){
        // Tomar los valores ingresados en el formulario
        int Value1 = vista.getValue1();
        int Value2 = vista.getValue2();
        // Invocar el metodo
        int Result = modelo.Rest(Value1,Value2);
        // Invocar el metodo setResultado para mostrar este resultado
        vista.setResult(Result);
    }
    public void doMultiply(){
        // Tomar los valores ingresados en el formulario
        int Value1 = vista.getValue1();
        int Value2 = vista.getValue2();
        // Invocar el metodo
        int Result = modelo.Multiply(Value1,Value2);
        // Invocar el metodo setResultado para mostrar este resultado
        vista.setResult(Result);
    }
    public void doDivide(){
        // Tomar los valores ingresados en el formulario
        int Value1 = vista.getValue1();
        int Value2 = vista.getValue2();
        // Invocar el metodo
        int Result = modelo.Divide(Value1,Value2);
        // Invocar el metodo setResultado para mostrar este resultado
        vista.setResult(Result);
    }
    
    
}
