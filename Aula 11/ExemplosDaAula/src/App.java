import javax.swing.JFrame;

public class App
{
   public static void main( String args[] )
   { 
      //CheckBoxFrame checkBoxFrame = new CheckBoxFrame(); 
      //checkBoxFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      //checkBoxFrame.setSize( 275, 100 ); // configura o tamanho do frame
      //checkBoxFrame.setVisible( true ); // exibe o frame

      //RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
      //radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      //radioButtonFrame.setSize( 300, 100 ); // configura o tamanho do frame
      //radioButtonFrame.setVisible( true ); // exibe o frame

      MenuFrame menuFrame = new MenuFrame(); // criar MenuFrame
      menuFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      menuFrame.setSize( 500, 200 ); // configura o tamanho do frame
      menuFrame.setVisible( true ); // exibe o frame
   } // fim de main
}