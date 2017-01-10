import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
public class GuessTheNumber extends JFrame
{
    private int Guesses = 0;
    private int GuessOld = 0;
    private int number; // application's number
    private JTextField guessInputJTextField; // user input field
    private JLabel prompt1JLabel; // first line of instruction
    private JLabel prompt2JLabel; // second line of instructions
    private JLabel messageJLabel; // displays message of game status
    private JLabel message2JLabel; //display number of guesses
    private JLabel random1 = new JLabel("");
    private JButton newGameJButton; // creates new game
    private Color background; // background color of application
    // set up GUI and initialize values
    public GuessTheNumber()
    {
        super("Guessing Game");
        setLayout(new FlowLayout());
        background = Color.LIGHT_GRAY; // set background to light gray
        prompt1JLabel = new JLabel("I have a number between 1 and 1000."); // describe game
        add(prompt1JLabel);
        prompt2JLabel = new JLabel("Can you guess my number? Enter your Guess:"); // prompt user
        add(prompt2JLabel);
        guessInputJTextField = new JTextField(5); // to enter guesses
        guessInputJTextField.addActionListener(new GuessHandler());
        add(guessInputJTextField);
        messageJLabel = new JLabel("");
        add(messageJLabel);
        message2JLabel = new JLabel ("");
        add (message2JLabel);
        newGameJButton = new JButton("New Game"); // create "New Game" button
        add(newGameJButton); // add newGame button to JFrame
        Random generator = new Random();
        number = generator.nextInt(1001);//create random number
        newGameJButton.addActionListener(
                new ActionListener() // anonymous inner class
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        guessInputJTextField.setText("");
                        Random generator = new Random();
                        int number = generator.nextInt(1001);
                        random1.setText("" + number);
                        SwingUtilities.updateComponentTreeUI(random1);
                        messageJLabel.setText("");
                        guessInputJTextField.setEditable(true);
                    } // end method actionPerformed
                } // end anonymous inner class
                ); // end call to addActionListener
        theGame(); // start new game
    } // end GuessGameFrame constructor
    // choose a new random number
    public void theGame()
    {
        Guesses = 0;
        message2JLabel.setText(" # of guesses = " + Integer.toString(Guesses));
    } // end method theGame
    // change background color
    class GuessHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int Guess;
            Guess = Integer.parseInt(guessInputJTextField.getText());
            if (Math.abs(number - Guess) < Math.abs(number - GuessOld))
            {
                // Hotter
                getContentPane().setBackground(Color.RED);
            }
            else
            {
                // Colder
                getContentPane().setBackground(Color.BLUE);
            }
            GuessOld = Guess;
            if (Guess > number)
            {
                messageJLabel.setText("Too High.");
                SwingUtilities.updateComponentTreeUI(messageJLabel);
            }
            if (Guess < number)
            {
                messageJLabel.setText("Too Low.");
                SwingUtilities.updateComponentTreeUI(messageJLabel);
            }
            // end if
            if (Guess == number) // guess is too low
            {
                messageJLabel.setText("Correct!");
                SwingUtilities.updateComponentTreeUI(messageJLabel);
                guessInputJTextField.setEditable(false);
            }
            Guesses++;
            message2JLabel.setText(" # of guesses = " + Integer.toString(Guesses));
        }
    }
}
