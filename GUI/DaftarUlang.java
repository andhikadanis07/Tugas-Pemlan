package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaftarUlang {
    private JFrame frame;
    private JTextField nameField, birthDateField, regNoField, phoneField, addressField, emailField;

    public DaftarUlang() {

        frame = new JFrame("Formulir Pendaftaran Ulang Mahasiswa Baru");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Nama Lengkap");
        nameLabel.setBounds(20, 5, 100, 35);
        nameField = new JTextField();
        nameField.setBounds(190, 15, 250, 20);

        JLabel birthDateLabel = new JLabel("Tanggal Lahir");
        birthDateLabel.setBounds(20, 47, 100, 35);
        birthDateField = new JTextField();
        birthDateField.setBounds(190, 55, 250, 20);

        JLabel regNoLabel = new JLabel("No. Pendaftaran");
        regNoLabel.setBounds(20, 53, 100, 100);
        regNoField = new JTextField();
        regNoField.setBounds(190, 95, 250, 20);

        JLabel phoneLabel = new JLabel("No Telp");
        phoneLabel.setBounds(20, 93, 100, 100);
        phoneField = new JTextField();
        phoneField.setBounds(190, 135, 250, 20);

        JLabel addressLabel = new JLabel("Alamat");
        addressLabel.setBounds(20, 148, 100, 100);
        addressField = new JTextField();
        addressField.setBounds(190, 175, 250, 50);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(20, 203, 100, 100);
        emailField = new JTextField();
        emailField.setBounds(190, 245, 250, 20);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(340, 295, 100, 35);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(birthDateLabel);
        frame.add(birthDateField);

        frame.add(regNoLabel);
        frame.add(regNoField);

        frame.add(phoneLabel);
        frame.add(phoneField);

        frame.add(addressLabel);
        frame.add(addressField);

        frame.add(emailLabel);
        frame.add(emailField);

        frame.add(new JLabel());
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (areFieldsEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Semua kolom harus diisi!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    int response = JOptionPane.showConfirmDialog(frame,
                            "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi",
                            JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        showConfirmationDialog();
                    }
                }
            }
        });

        frame.setVisible(true);
    }

    private boolean areFieldsEmpty() {
        return nameField.getText().isEmpty() || birthDateField.getText().isEmpty() || regNoField.getText().isEmpty() ||
                phoneField.getText().isEmpty() || addressField.getText().isEmpty() || emailField.getText().isEmpty();
    }

    private void showConfirmationDialog() {
        JFrame confirmationFrame = new JFrame("Konfirmasi Data");
        confirmationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        confirmationFrame.setSize(400, 380);
        confirmationFrame.setLayout(null);

        JLabel nameLabel = new JLabel("Nama Lengkap: " + nameField.getText());
        nameLabel.setBounds(20, 20, 360, 25);
        confirmationFrame.add(nameLabel);

        JLabel birthDateLabel = new JLabel("Tanggal Lahir: " + birthDateField.getText());
        birthDateLabel.setBounds(20, 60, 360, 25);
        confirmationFrame.add(birthDateLabel);

        JLabel regNoLabel = new JLabel("No. Pendaftaran: " + regNoField.getText());
        regNoLabel.setBounds(20, 100, 360, 25);
        confirmationFrame.add(regNoLabel);

        JLabel phoneLabel = new JLabel("No Telp: " + phoneField.getText());
        phoneLabel.setBounds(20, 140, 360, 25);
        confirmationFrame.add(phoneLabel);

        JLabel addressLabel = new JLabel("Alamat: " + addressField.getText());
        addressLabel.setBounds(20, 180, 360, 25);
        confirmationFrame.add(addressLabel);

        JLabel emailLabel = new JLabel("Email: " + emailField.getText());
        emailLabel.setBounds(20, 220, 360, 25);
        confirmationFrame.add(emailLabel);

        JButton closeButton = new JButton("Tutup");
        closeButton.setBounds(150, 260, 100, 30);
        closeButton.addActionListener(e -> confirmationFrame.dispose());
        confirmationFrame.add(closeButton);

        confirmationFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DaftarUlang::new);
    }
}
