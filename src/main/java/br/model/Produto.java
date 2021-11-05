package br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.form.ProdutoForm;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 200, nullable = false)
	private String produto;
	@Column(nullable = false)
	private String codigoProduto;
	@Column(length = 100)
	private String categoria;
	@Column(nullable = false)
	private Double valorCusto;
	@Column(nullable = false)
	private Double precoVenda;
	private Double margemContribuicao;
	@Column(nullable = false)
	private Integer controlarEstoque;
	@Column(nullable = false)
	private int estoqueAtual;
	@Column(nullable = false)
	private int estoqueMinimo;
	@Column(length = 250, nullable = false)
	private String observacao;
	/*
	 * Dados fiscais.
	 */
	@Column(nullable = false)
	private int origem;
	private int referenciaEanGtin;// https://www.fazenda.sp.gov.br/nfe/perguntas_frequentes/respostas_X.asp#:~:text=GTINs%2C%20anteriormente%20chamado%20c%C3%B3digos%20EAN,mat%C3%A9rias%20primas%20at%C3%A9%20produtos%20acabados.
	private Double pesoUnitarioLiquidoKg;
	private Double pesoUnitarioBrutoKg;
	private int ncm;// https://investexportbrasil.dpr.gov.br/ProdutosServicos/frmPesquisaProdutosServicosFull.aspx
	private int exIpi;// https://blog.eficienciafiscal.com.br/o-que-e-ex-tipi/#:~:text=De%20forma%20muito%20simples%2C%20a,tributa%C3%A7%C3%A3o%20de%20um%20item%20espec%C3%ADfico.
	private String cBenef;// https://blog.oobj.com.br/cbenef/
	private String uCom;// unidade de comercialização(unidade de medida)
	private String utrib;// unidade tributada(quantidade de unidades tributadas)
	@Column(length = 200, nullable = false)
	private int qtdTributada;
	private String anotacoesNfe;
	
	public Produto() {
	}
	
	public Produto(ProdutoForm form) {
		this.produto = form.getProduto();
		this.codigoProduto = form.getCodigoProduto();
		this.categoria = form.getCategoria();
		this.valorCusto = form.getValorCusto();
		this.precoVenda = form.getPrecoVenda();
		this.margemContribuicao = form.getMargemContribuicao();
		this.controlarEstoque = form.getControlarEstoque();
		this.estoqueAtual = form.getEstoqueAtual();
		this.estoqueMinimo = form.getEstoqueMinimo();
		this.observacao = form.getObservacao();
		this.origem = form.getOrigem();
		this.referenciaEanGtin = form.getReferenciaEanGtin();
		this.pesoUnitarioBrutoKg = form.getPesoUnitarioBrutoKg();
		this.pesoUnitarioLiquidoKg = form.getPesoUnitarioLiquidoKg();
		this.ncm = form.getNcm();
		this.exIpi = form.getExIpi();
		this.cBenef = form.getcBenef();
		this.uCom = form.getuCom();
		this.utrib = form.getUtrib();
		this.qtdTributada = form.getQtdTributada();
		this.anotacoesNfe = form.getAnotacoesNfe();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(Double valorCusto) {
		this.valorCusto = valorCusto;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Double getMargemContribuicao() {
		return margemContribuicao;
	}

	public void setMargemContribuicao(Double margemContribuicao) {
		this.margemContribuicao = margemContribuicao;
	}

	public Integer getControlarEstoque() {
		return controlarEstoque;
	}

	public void setControlarEstoque(Integer controlarEstoque) {
		this.controlarEstoque = controlarEstoque;
	}

	public int getEstoqueAtual() {
		return estoqueAtual;
	}

	public void setEstoqueAtual(int estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getOrigem() {
		return origem;
	}

	public void setOrigem(int origem) {
		this.origem = origem;
	}

	public int getReferenciaEanGtin() {
		return referenciaEanGtin;
	}

	public void setReferenciaEanGtin(int referenciaEanGtin) {
		this.referenciaEanGtin = referenciaEanGtin;
	}

	public Double getPesoUnitarioLiquidoKg() {
		return pesoUnitarioLiquidoKg;
	}

	public void setPesoUnitarioLiquidoKg(Double pesoUnitarioLiquidoKg) {
		this.pesoUnitarioLiquidoKg = pesoUnitarioLiquidoKg;
	}

	public Double getPesoUnitarioBrutoKg() {
		return pesoUnitarioBrutoKg;
	}

	public void setPesoUnitarioBrutoKg(Double pesoUnitarioBrutoKg) {
		this.pesoUnitarioBrutoKg = pesoUnitarioBrutoKg;
	}

	public int getNcm() {
		return ncm;
	}

	public void setNcm(int ncm) {
		this.ncm = ncm;
	}

	public int getExIpi() {
		return exIpi;
	}

	public void setExIpi(int exIpi) {
		this.exIpi = exIpi;
	}

	public String getcBenef() {
		return cBenef;
	}

	public void setcBenef(String cBenef) {
		this.cBenef = cBenef;
	}

	public String getuCom() {
		return uCom;
	}

	public void setuCom(String uCom) {
		this.uCom = uCom;
	}

	public String getUtrib() {
		return utrib;
	}

	public void setUtrib(String utrib) {
		this.utrib = utrib;
	}

	public int getQtdTributada() {
		return qtdTributada;
	}

	public void setQtdTributada(int qtdTributada) {
		this.qtdTributada = qtdTributada;
	}

	public String getAnotacoesNfe() {
		return anotacoesNfe;
	}

	public void setAnotacoesNfe(String anotacoesNfe) {
		this.anotacoesNfe = anotacoesNfe;
	}

}
