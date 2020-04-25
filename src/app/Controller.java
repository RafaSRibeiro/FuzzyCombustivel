package app;

import fuzzy.Combustivel;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.text.Text;

public class Controller {

    public Slider sliderVelocidade;

    public Slider sliderTemperatura;

    public Text textResult;

    @FXML
    public void calculaConsumo() {
        textResult.setText("Consumo: " + Combustivel.calculaConsumo(sliderVelocidade.getValue(), sliderTemperatura.getValue()) + " Km/l");
    }
}
