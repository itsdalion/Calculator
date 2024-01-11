import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calculator2_0 {

	protected Shell shell;
	Label lblApprox;

	long curNum = 0;
	long preNum = 0;
	long answer = 0;
	long savedNum = 0;
	long curSigfig = 0;
	long preSigfig = 0;
	long answerSigfig = 0;
	long savedSigfig = 0;

	String operator = "";

	boolean diffNum = false;
	boolean decimal = false;
	boolean preDec = false;
	boolean approx = false;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calculator2_0 window = new Calculator2_0();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 500);
		shell.setText("Calculator 2.0");

		Label screen = new Label(shell, SWT.NONE);
		screen.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 55, SWT.NORMAL));
		screen.setAlignment(SWT.RIGHT);
		screen.setBounds(118, 10, 315, 66);
		screen.setText("0");

		///////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////

		Button button0 = new Button(shell, SWT.NONE);
		button0.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		button0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(0);
				diffNum = true;
				curNum = curNum * 10;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!decimal) {
					screen.setText(curNum + "");
				}
				if (decimal) {
					curSigfig++;
					screen.setText(curNum / Math.pow(10, curSigfig) + "");

				}
			}
		});
		button0.setBounds(10, 375, 102, 85);
		button0.setText("0");

		Button button1 = new Button(shell, SWT.NONE);
		button1.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(1);
				curNum = curNum * 10 + 1;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!decimal) {
					screen.setText(curNum + "");
				}
				if (decimal) {
					curSigfig++;
					screen.setText(curNum / Math.pow(10, curSigfig) + "");

				}
				diffNum = true;
			}
		});
		button1.setText("1");
		button1.setBounds(10, 284, 102, 85);

		Button button2 = new Button(shell, SWT.NONE);
		button2.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		button2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(2);
				curNum = curNum * 10 + 2;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!decimal) {
					screen.setText(curNum + "");
				}
				if (decimal) {
					curSigfig++;
					screen.setText(curNum / Math.pow(10, curSigfig) + "");

				}
				diffNum = true;
			}
		});
		button2.setText("2");
		button2.setBounds(118, 284, 102, 85);

		Button button3 = new Button(shell, SWT.NONE);
		button3.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		button3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(3);
				curNum = curNum * 10 + 3;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!decimal) {
					screen.setText(curNum + "");
				}
				if (decimal) {
					curSigfig++;
					screen.setText(curNum / Math.pow(10, curSigfig) + "");

				}
				diffNum = true;
			}
		});
		button3.setText("3");
		button3.setBounds(226, 284, 102, 85);

		Button button4 = new Button(shell, SWT.NONE);
		button4.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		button4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(4);
				curNum = curNum * 10 + 4;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!decimal) {
					screen.setText(curNum + "");
				}
				if (decimal) {
					curSigfig++;
					screen.setText(curNum / Math.pow(10, curSigfig) + "");

				}
				diffNum = true;
			}
		});
		button4.setText("4");
		button4.setBounds(10, 193, 102, 85);

		Button button5 = new Button(shell, SWT.NONE);
		button5.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		button5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(5);
				curNum = curNum * 10 + 5;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!decimal) {
					screen.setText(curNum + "");
				}
				if (decimal) {
					curSigfig++;
					screen.setText(curNum / Math.pow(10, curSigfig) + "");

				}
				diffNum = true;
			}
		});
		button5.setText("5");
		button5.setBounds(118, 193, 102, 85);

		Button button6 = new Button(shell, SWT.NONE);
		button6.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		button6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(6);
				curNum = curNum * 10 + 6;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!decimal) {
					screen.setText(curNum + "");
				}
				if (decimal) {
					curSigfig++;
					screen.setText(curNum / Math.pow(10, curSigfig) + "");

				}
				diffNum = true;
			}
		});
		button6.setText("6");
		button6.setBounds(226, 193, 102, 85);

		Button button7 = new Button(shell, SWT.NONE);
		button7.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		button7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(7);
				curNum = curNum * 10 + 7;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!decimal) {
					screen.setText(curNum + "");
				}
				if (decimal) {
					curSigfig++;
					screen.setText(curNum / Math.pow(10, curSigfig) + "");

				}
				diffNum = true;
			}
		});
		button7.setText("7");
		button7.setBounds(10, 102, 102, 85);

		Button button8 = new Button(shell, SWT.NONE);
		button8.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		button8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(8);
				curNum = curNum * 10 + 8;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!decimal) {
					screen.setText(curNum + "");
				}
				if (decimal) {
					curSigfig++;
					screen.setText(curNum / Math.pow(10, curSigfig) + "");

				}
				diffNum = true;
			}
		});
		button8.setText("8");
		button8.setBounds(118, 102, 102, 85);

		Button button9 = new Button(shell, SWT.NONE);
		button9.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		button9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(9);
				curNum = curNum * 10 + 9;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!decimal) {
					screen.setText(curNum + "");
				}
				if (decimal) {
					curSigfig++;
					screen.setText(curNum / Math.pow(10, curSigfig) + "");

				}
				diffNum = true;
			}
		});
		button9.setText("9");
		button9.setBounds(226, 102, 102, 85);

		///////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////

		Button buttonDec = new Button(shell, SWT.NONE);
		buttonDec.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		buttonDec.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Decimal");
				decimal = true;
				screen.setText(screen.getText() + ".");
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

			}
		});
		buttonDec.setText(".");
		buttonDec.setBounds(118, 375, 102, 85);

		///////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////

		Button buttonAdd = new Button(shell, SWT.NONE);
		buttonAdd.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 25, SWT.NORMAL));
		buttonAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Add");
				operator = "add";
				preNum = curNum;
				curNum = 0;
				preSigfig = curSigfig;
				curSigfig = 0;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!diffNum) {
					preNum = answer;
					preSigfig = answerSigfig;
					if (approx && preSigfig == 5)
						lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
				}

				preDec = decimal;
				decimal = false;

			}
		});
		buttonAdd.setText("+");
		buttonAdd.setBounds(334, 102, 102, 85);

		Button buttonSub = new Button(shell, SWT.NONE);
		buttonSub.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 25, SWT.NORMAL));
		buttonSub.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Subtract");
				operator = "subtract";
				preNum = curNum;
				curNum = 0;
				preSigfig = curSigfig;
				curSigfig = 0;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!diffNum) {
					preNum = answer;
					preSigfig = answerSigfig;
					if (approx && preSigfig == 5)
						lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
				}

				preDec = decimal;
				decimal = false;

			}
		});
		buttonSub.setText("-");
		buttonSub.setBounds(334, 193, 102, 85);

		Button buttonMul = new Button(shell, SWT.NONE);
		buttonMul.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 25, SWT.NORMAL));
		buttonMul.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Multiply");
				operator = "multiply";
				preNum = curNum;
				curNum = 0;
				preSigfig = curSigfig;
				curSigfig = 0;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!diffNum) {
					preNum = answer;
					preSigfig = answerSigfig;
					if (approx && preSigfig == 5)
						lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
				}

				preDec = decimal;
				decimal = false;

			}
		});
		buttonMul.setText("x");
		buttonMul.setBounds(334, 284, 102, 85);

		Button buttonDiv = new Button(shell, SWT.NONE);
		buttonDiv.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 25, SWT.NORMAL));
		buttonDiv.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Divide");
				operator = "divide";
				preNum = curNum;
				curNum = 0;
				preSigfig = curSigfig;
				curSigfig = 0;
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				if (!diffNum) {
					preNum = answer;
					preSigfig = answerSigfig;
					if (approx && preSigfig == 5)
						lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));

				}

				preDec = decimal;
				decimal = false;

			}
		});
		buttonDiv.setText("÷");
		buttonDiv.setBounds(334, 375, 102, 85);

		///////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////

		Button buttonEqu = new Button(shell, SWT.NONE);
		buttonEqu.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 25, SWT.NORMAL));
		buttonEqu.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if (preNum == answer && approx && preSigfig == 5)
					lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));

				if (operator.equals("add")) {
					double answer2 = preNum / Math.pow(10, preSigfig) + curNum / Math.pow(10, curSigfig);
					answerSigfig = Math.max(preSigfig, curSigfig);
					answer = (preNum + curNum) / (long) Math.pow(10, answerSigfig);

					if (answer2 != answer) {
						answer = (long) Math.round(answer2 * Math.pow(10, answerSigfig));
						// screen.setText(answer2+"");
						screen.setText(answer / Math.pow(10, answerSigfig) + "");
					} else {
						screen.setText(answer + "");
						answerSigfig = 0;
					}

				}

				else if (operator.equals("subtract")) {
					double answer2 = preNum / Math.pow(10, preSigfig) - curNum / Math.pow(10, curSigfig);
					answerSigfig = Math.max(preSigfig, curSigfig);
					answer = (preNum - curNum) / (long) Math.pow(10, answerSigfig);

					if (answer2 != answer) {
						answer = (long) Math.round(answer2 * Math.pow(10, answerSigfig));
						// screen.setText(answer2+"");
						screen.setText(answer / Math.pow(10, answerSigfig) + "");
					} else {
						screen.setText(answer + "");
						answerSigfig = 0;
					}

				}

				else if (operator.equals("multiply")) {
					double answer2 = preNum / Math.pow(10, preSigfig) * (curNum / Math.pow(10, curSigfig));
					answerSigfig = preSigfig + curSigfig;
					answer = (preNum * curNum) / (long) Math.pow(10, answerSigfig);

					if (answer2 != answer) {

						approx = false;

						if (answerSigfig > 5) {
							answerSigfig = 5;
							lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
							approx = true;
							answer2 = ((long) Math.round(answer2 * 100000)) / 100000.0;
						}

						answer = (long) Math.round(answer2 * Math.pow(10, answerSigfig));
						screen.setText(answer / Math.pow(10, answerSigfig) + "");
					} else {
						approx = false;
						screen.setText(answer + "");
						answerSigfig = 0;
					}
				}

				else if (operator.equals("divide")) {
					if (curNum == 0)
						screen.setText("Error");
					else {

						double answer2;

						if (preSigfig < curSigfig) {
							long NEWpreNum = preNum * (long) Math.pow(10, curSigfig - preSigfig);
							answer2 = (double) NEWpreNum / curNum;
						} else {
							long NEWcurNum = curNum * (long) Math.pow(10, preSigfig - curSigfig);
							answer2 = (double) preNum / NEWcurNum;
						}

						if ((preNum / Math.pow(10, preSigfig)) == (curNum / Math.pow(10, curSigfig))) {
							screen.setText("1");
							answer = 1;
							answerSigfig = 0;
						} else {
							answer = (long) answer2;

							if (answer2 != answer) {
								answerSigfig = (answer2 + "").length() - (answer + "").length() - 1;
								approx = false;

								if (answerSigfig > 5) {
									answerSigfig = 5;
									lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
									approx = true;
									answer2 = ((long) Math.round(answer2 * 100000)) / 100000.0;
								}

								answer = (long) Math.round(answer2 * Math.pow(10, answerSigfig));
								screen.setText(answer2 + "");
							} else {
								approx = false;
								answer = (long) Math.round(answer2 * Math.pow(10, answerSigfig));
								screen.setText(answer + "");
								answerSigfig = 0;
							}
						}
					}
				}

				System.out.println("preNum:" + preNum + ", curNum:" + curNum);
				System.out.println("preSigfig:" + preSigfig + ", curSigfig:" + curSigfig);
				System.out.println("answer:" + answer + ", answerSigfig: " + answerSigfig);
				System.out.println("");

				curNum = 0;
				diffNum = false;
				operator = "solve";

				decimal = false;
				curSigfig = 0;

			}
		});
		buttonEqu.setText("=");
		buttonEqu.setBounds(226, 375, 102, 85);
		
		
		

		///////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////

		Button buttonReset = new Button(shell, SWT.NONE);
		buttonReset.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("-----=Reset=-----");
				curNum = 0;
				preNum = 0;
				curSigfig = 0;
				decimal = false;
				screen.setText("0");
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

			}
		});
		buttonReset.setText("Clear");
		buttonReset.setBounds(10, 10, 102, 39);

		Button buttonSave = new Button(shell, SWT.NONE);
		buttonSave.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if (operator == "solve" && !diffNum) {
					savedNum = answer;
					savedSigfig = answerSigfig;
				} else {
					savedNum = curNum;
					savedSigfig = curSigfig;
				}

				screen.setText("0");
				lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

				System.out.println("-Saved--->" + savedNum);

				curNum = 0;
				curSigfig = 0;
				decimal = false;

			}
		});
		buttonSave.setText("Save");
		buttonSave.setBounds(10, 55, 47, 39);

		Button buttonPaste = new Button(shell, SWT.NONE);
		buttonPaste.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				curNum = savedNum;
				curSigfig = savedSigfig;
				answer = savedNum;
				answerSigfig = savedSigfig;

				double curNum2 = curNum / Math.pow(10, curSigfig);
				if (curNum2 != (double) (curNum / (long) Math.pow(10, curSigfig)))
					screen.setText(curNum2 + "");
				else
					screen.setText(curNum + "");

				System.out.println("-Paste--->" + curNum);
			}
		});
		buttonPaste.setText("Paste");
		buttonPaste.setBounds(63, 55, 50, 39);

		lblApprox = new Label(shell, SWT.NONE);
		lblApprox.setAlignment(SWT.CENTER);
		lblApprox.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		lblApprox.setBounds(360, 82, 73, 20);
		lblApprox.setText("~ Approx ~");

	}

}
