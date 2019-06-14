package view;

import javax.swing.JOptionPane;

import model.professor;

public class execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		professor professor = new professor();
		
		professor.setNome(JOptionPane.showInputDialog(null, "Nome: "));
		professor.setEndereco(JOptionPane.showInputDialog(null, "Endereco: "));
		professor.setBairro(JOptionPane.showInputDialog(null, "Bairro: "));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "CEP: ")));
		professor.setCidade(JOptionPane.showInputDialog(null, "Cidade: "));
		professor.setEstado(JOptionPane.showInputDialog(null, "Estado: "));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null, "RG: ")));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "CPF: ")));
		
		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas você possui?"));
			String disciplinas[] = new String[dis];
			for (int i = 0; i < dis; i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina" + i);
			}
			professor.setDisciplinas(disciplinas);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cursos você possui?"));
			String cursos[] = new String[cur];
			for (int i= 0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso: " + i);
			}
			professor.setCursos(cursos);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}