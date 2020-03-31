/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package stocksys.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <pre>
 * [分類] 2020-03-27 19:13
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
@Entity
@Table(name = "test_classify")
public class Classify implements Serializable {

	private static final long serialVersionUID = 2588210545781748287L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "transaction")
	private Boolean transaction; // 此金融商品是否可交易

//	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="classify")
//	@JsonIgnoreProperties("classify")
//	private Set<TxStock> txStocks;

	public Classify() {}

	public Classify(String name, Boolean transaction) {
		this.name = name;
		this.transaction = transaction;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getTransaction() {
		return transaction;
	}

	public void setTransaction(Boolean transaction) {
		this.transaction = transaction;
	}

//	public Set<TxStock> getTxStocks() {
//		return txStocks;
//	}

//	public void setTxStocks(Set<TxStock> txStocks) {
//		this.txStocks = txStocks;
//	}

	@Override
	public String toString() {
		return "Classify [id=" + id +
				", name=" + name +
				", transaction=" + transaction +
				"]";
	}
}
