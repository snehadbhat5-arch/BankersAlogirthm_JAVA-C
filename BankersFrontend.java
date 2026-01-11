import java.awt.*;
import java.io.*;
import javax.swing.*;

public class BankersFrontend extends JFrame {

    private JTextArea output;
    private JButton runBtn;

    public BankersFrontend() {
        setTitle("Banker's Algorithm - Direct Execution");
        setSize(500, 350);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Java Frontend executing C Backend", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        add(title, BorderLayout.NORTH);

        output = new JTextArea();
        output.setEditable(false);
        add(new JScrollPane(output), BorderLayout.CENTER);

        runBtn = new JButton("Run Banker's Algorithm");
        runBtn.addActionListener(e -> runBankersAlgorithm());
        add(runBtn, BorderLayout.SOUTH);
    }

    private void runBankersAlgorithm() {
    try {
        ProcessBuilder pb = new ProcessBuilder("bankers.exe");
        pb.redirectErrorStream(true);

        Process process = pb.start();
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(process.getInputStream()));

        output.setText("");
        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line + "\n");
        }

        process.waitFor();

    } catch (IOException | InterruptedException e) {
        output.setText("Error running C program:\n" + e.getMessage());
    }
}
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BankersFrontend().setVisible(true);
        });
    }
}