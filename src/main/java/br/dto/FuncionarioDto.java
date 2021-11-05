package br.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.model.Funcionario;

public class FuncionarioDto {
	private Long id;
	private String nome;
	private String cpf;
	private String telefone;
	private String telefoneResidencial;
	private String tituloEleitor;
	private int grauDeInstrucao;
	private Integer status;
	private String foto;
	private LocalDate data;
	private LocalDate dataAdmissao;
	private LocalDate dataDemissao;
	private Double salarioExtra;
	private Double salarioBase;
	private Double salarioFamilia;
	private String ctps;
	private LocalDate dataNascimentoFuncionario;
	private int sexo;
	private String estadoCivil;
	private String rg;
	private String orgaoEspedidor;
	private int banco;
	private String operacaoBancaria;
	private String agencia;
	private String conta;
	private String usuario;
	private String senha;
	private String token;
	private String permissoes;

	private EnderecoDto endereco;
	private Long departamento;
	private Long cargo;

	public FuncionarioDto() {
	}

	public FuncionarioDto(Funcionario funcionario) {
		this.id = funcionario.getId();
		this.nome = funcionario.getNome();
		this.cpf = funcionario.getCpf();
		this.telefone = funcionario.getTelefone();
		this.telefoneResidencial = funcionario.getTelefoneResidencial();
		this.tituloEleitor = funcionario.getTituloEleitor();
		this.grauDeInstrucao = funcionario.getGrauDeInstrucao();
		this.status = funcionario.getStatus();
		this.foto = funcionario.getFoto();
		this.data = funcionario.getData();
		this.dataAdmissao = funcionario.getDataAdmissao();
		this.dataDemissao = funcionario.getDataDemissao();
		this.salarioExtra = funcionario.getSalarioExtra();
		this.salarioBase = funcionario.getSalarioBase();
		this.salarioFamilia = funcionario.getSalarioFamilia();
		this.ctps = funcionario.getCtps();
		this.dataNascimentoFuncionario = funcionario.getDataNascimentoFuncionario();
		this.sexo = funcionario.getSexo();
		this.estadoCivil = funcionario.getEstadoCivil();
		this.rg = funcionario.getRg();
		this.orgaoEspedidor = funcionario.getOrgaoEspedidor();
		this.banco = funcionario.getBanco();
		this.operacaoBancaria = funcionario.getOperacaoBancaria();
		this.agencia = funcionario.getAgencia();
		this.conta = funcionario.getConta();
		this.endereco = new EnderecoDto();
		endereco.setBairro(funcionario.getBairro());
		endereco.setCEP(funcionario.getCEP());
		endereco.setCidade(funcionario.getCidade());
		endereco.setLogradouro(funcionario.getLogradouro());
		endereco.setUf(funcionario.getUf());
		this.id = funcionario.getId();
		this.permissoes = funcionario.getPermissoes();
		this.senha = funcionario.getSenha();
		this.token = funcionario.getToke();
		this.usuario = funcionario.getUsuario();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(String permissoes) {
		this.permissoes = permissoes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getTituloEleitor() {
		return tituloEleitor;
	}

	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	public int getGrauDeInstrucao() {
		return grauDeInstrucao;
	}

	public void setGrauDeInstrucao(int grauDeInstrucao) {
		this.grauDeInstrucao = grauDeInstrucao;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public LocalDate getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(LocalDate dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public Double getSalarioExtra() {
		return salarioExtra;
	}

	public void setSalarioExtra(Double salarioExtra) {
		this.salarioExtra = salarioExtra;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getSalarioFamilia() {
		return salarioFamilia;
	}

	public void setSalarioFamilia(Double salarioFamilia) {
		this.salarioFamilia = salarioFamilia;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoEspedidor() {
		return orgaoEspedidor;
	}

	public void setOrgaoEspedidor(String orgaoEspedidor) {
		this.orgaoEspedidor = orgaoEspedidor;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public String getOperacaoBancaria() {
		return operacaoBancaria;
	}

	public void setOperacaoBancaria(String operacaoBancaria) {
		this.operacaoBancaria = operacaoBancaria;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public EnderecoDto getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDto endereco) {
		this.endereco = endereco;
	}

	public List<FuncionarioDto> convert(List<Funcionario> cargo2) {
		return cargo2.stream().map(FuncionarioDto::new).collect(Collectors.toList());
	}

	public LocalDate getDataNascimentoFuncionario() {
		return dataNascimentoFuncionario;
	}

	public void setDataNascimentoFuncionario(LocalDate dataNascimentoFuncionario) {
		this.dataNascimentoFuncionario = dataNascimentoFuncionario;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Long departamento) {
		this.departamento = departamento;
	}

	public Long getCargo() {
		return cargo;
	}

	public void setCargo(Long cargo) {
		this.cargo = cargo;
	}

}
