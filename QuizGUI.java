/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package climateapp;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author shemeneroje
 */
public class QuizGUI extends javax.swing.JFrame {
    
    // create an array of questions    
    String[] questions = {"What is Climate Change?",
        "Why should we recycle?",
        "Which of these animals is endangered due to climate change?",
        "What is one thing we can do to save water?",
        "Which of these actions can help reduce air pollution?", 
        "What does it mean to conserve energy?", 
        "What do coral reefs provide for ocean animals?", 
        "Why is planting trees good for the Earth?", 
        "What can happen if we throw plastic in the ocean?", 
        "What is a habitat?"};
    
    String[][] options = {
    {"A type of weather", "A kind of cloud", "A season", "Long-term changes in temperature and weather patterns"},  
    {"To create more trash", "To fill up landfills faster", "To make more pollution", "To help protect the environment by reusing materials"},  
    {"Cat", "Dog", "Elephant", "Polar bear"}, 
    {"Leave the tap running", "Use more water", "Water plants in the middle of the day", "Turn off the tap when brushing teeth"},  
    {"Using more plastic", "Driving everywhere", "Burning more coal", "Planting trees"}, 
    {"Leaving all the lights on at night.", "Using more appliances at the same time.", "Ignoring energy-saving practices in daily life.","Using energy efficiently to reduce waste. "},
    {"An amusement park", "A playground", "A food source", "A place to live"}, 
    {"Trees make paper", "Trees block the sun", "Trees are good for climbing", "Trees produce oxygen, which we breathe"}, 
    {"t will dissolve quickly and disappear.", "It can turn into clean drinking water.", "It can make the ocean smell fresher.", "It can harm marine life and pollute the water for years. "},
    {"A type of food", "A type of weather", "A type of clothing", "A place where plants and animals live"} };
    
    int index = 0, correct = 0;
    
    // button group to contain the radiobuttons
    ButtonGroup bg = new ButtonGroup();
    


    /**
     * Creates new form QuizGUI
     */
    public QuizGUI() {
        initComponents();
        
        
        nextQuestion.addActionListener(evt -> nextQuestionActionPerformed());
        
    
        
        // add the radiobuttons to the button group 
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        bg.add(jRadioButton4);
        
        displayQuestion();
        
        //nextQuestionActionPerformed(null);
    }
    
    
    public void getSelectedOption() {
        JRadioButton selectedButton = null;
        if (jRadioButton1.isSelected()) selectedButton = jRadioButton1;
        else if (jRadioButton2.isSelected()) selectedButton = jRadioButton2;
        else if (jRadioButton3.isSelected()) selectedButton = jRadioButton3;
        else if (jRadioButton4.isSelected()) selectedButton = jRadioButton4;

        // Check if the selected answer is correct
        if (selectedButton != null && selectedButton.getText().equals(options[index][3])) {
            correct++;
        }
    }
        
        public void getSelectedOption(JRadioButton rbtn){
            // get the selected value from the radiobutton
            // increment the index
            // disable the radiobuttons
            // check if the user selected the right answer
           System.out.println(rbtn.getText());
           System.out.println(options[index][4]);
           
           if (rbtn.getText().equals(options[index][4])) {
               correct++;
           }
            index++;
            enableRbuttons(false);
        }
           
        // enable/ disable radiobuttons
        public void enableRbuttons(boolean yes_or_no){
            jRadioButton1.setEnabled(yes_or_no);
            jRadioButton2.setEnabled(yes_or_no);
            jRadioButton3.setEnabled(yes_or_no);
            jRadioButton4.setEnabled(yes_or_no);
        }
        
        // Displays the question and options at the current index
    public void displayQuestion() {
        if (index < questions.length) {
            Ouestion.setText(questions[index]);
            jRadioButton1.setText(options[index][0]);
            jRadioButton2.setText(options[index][1]);
            jRadioButton3.setText(options[index][2]);
            jRadioButton4.setText(options[index][3]);
            bg.clearSelection(); // Clear previous selection
            enableRbuttons(true); // Enable the buttons for a new question
        }
    }
    
                         

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OuestionContainer = new javax.swing.JPanel();
        Ouestion = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        nextQuestion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        OuestionContainer.setBackground(new java.awt.Color(0, 255, 204));

        Ouestion.setFont(new java.awt.Font("Chalkduster", 1, 18)); // NOI18N
        Ouestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ouestion.setText("Ouestion here ??");

        javax.swing.GroupLayout OuestionContainerLayout = new javax.swing.GroupLayout(OuestionContainer);
        OuestionContainer.setLayout(OuestionContainerLayout);
        OuestionContainerLayout.setHorizontalGroup(
            OuestionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OuestionContainerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Ouestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        OuestionContainerLayout.setVerticalGroup(
            OuestionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OuestionContainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Ouestion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jRadioButton1.setFont(new java.awt.Font("Chalkduster", 0, 14)); // NOI18N
        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setFont(new java.awt.Font("Chalkduster", 0, 14)); // NOI18N
        jRadioButton2.setText("jRadioButton2");

        jRadioButton3.setFont(new java.awt.Font("Chalkduster", 0, 14)); // NOI18N
        jRadioButton3.setText("jRadioButton4");

        jRadioButton4.setFont(new java.awt.Font("Chalkduster", 0, 14)); // NOI18N
        jRadioButton4.setText("jRadioButton3");

        nextQuestion.setBackground(new java.awt.Color(0, 255, 204));
        nextQuestion.setFont(new java.awt.Font("Chalkduster", 0, 16)); // NOI18N
        nextQuestion.setText("Next");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OuestionContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(nextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OuestionContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jRadioButton1)
                .addGap(4, 4, 4)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(nextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nextQuestionActionPerformed() {
        
        
        getSelectedOption();

        index++;

        if (index >= questions.length) {
            nextQuestion.setText("Play Again");
            nextQuestion.setText("Your Score: " + correct + " / " + questions.length);
            Ouestion.setText("Quiz Completed! Your Score: " + correct + " / " + questions.length);
            nextQuestion.setEnabled(false);
            enableRbuttons(false);
        } else {
            displayQuestion();
            if (index == questions.length - 1) {
                nextQuestion.setText("Finish and See The Result");
            } else {
                nextQuestion.setText("Next");
            }
        }
    }

    private void resetQuiz() {
        
        if (nextQuestion.getText().equals("Play Again")) {
            resetQuiz();
            return;
        }
        index = 0;
        correct = 0;
        displayQuestion();
        nextQuestion.setText("Next");
        nextQuestion.setEnabled(true);
        enableRbuttons(true);
    }


   
    
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        getSelectedOption(jRadioButton1);
    }                                              

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        getSelectedOption(jRadioButton2);
    }                                              

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        getSelectedOption(jRadioButton3);
    }                                              

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        getSelectedOption(jRadioButton4);
    }                         
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizGUI().setVisible(true);
            }
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ouestion;
    private javax.swing.JPanel OuestionContainer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JButton nextQuestion;
    // End of variables declaration//GEN-END:variables
}
