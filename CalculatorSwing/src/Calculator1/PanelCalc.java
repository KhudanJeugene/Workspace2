package Calculator1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCalc extends JPanel
{
	private static final long serialVersionUID = 1L;
	public PanelCalc()
	{
		setLayout(new GridLayout(4,2));
		JLabel lbl1 = new JLabel("Input a");
		JLabel lbl2 = new JLabel("Input b");
		JLabel lbl3 = new JLabel("a+b");
		JTextField txt1 = new JTextField();
		JTextField txt2 = new JTextField();
		JTextField txt3 = new JTextField();
		
		JButton btn = new JButton("Calc");
		btn.setBounds(10, 40, 120, 20);
		add(lbl1);	
		add(txt1);
		add(lbl2);
		add(txt2);
		add(lbl3);
		add(txt3);
		add(btn);
		
		
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
				int val1 = Integer.parseInt(txt1.getText());
				int val2 = Integer.parseInt(txt2.getText());
				int res = val1 + val2;
				txt3.setText(String.valueOf(res));
				}
				catch(NumberFormatException e1)
				{
					txt3.setText("Invalid");
				}
			}
		});
	}
}
