import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListenner implements ActionListener {

    private int countClic;
    private JLabel label;
    public ButtonListenner(JLabel label){
        this.label = label;
        this.countClic = 0;
    }


    @Override
    public void actionPerformed(ActionEvent e){

        label.setText("Vous avez " + this.countClic + "€");
        this.countClic += 1;
    }

}
