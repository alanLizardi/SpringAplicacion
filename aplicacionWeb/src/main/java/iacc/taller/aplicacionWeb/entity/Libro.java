package iacc.taller.aplicacionWeb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3456200378537261926L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ISBN;
	@Column
	private String nombreLibro;
	@Column
	private String editorial;
	@Column
	private String descripcion;
	@Column
	private String autor;
	@Column
	private int idCategoria;

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((editorial == null) ? 0 : editorial.hashCode());
		result = prime * result + idCategoria;
		result = prime * result + ((nombreLibro == null) ? 0 : nombreLibro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (editorial == null) {
			if (other.editorial != null)
				return false;
		} else if (!editorial.equals(other.editorial))
			return false;
		if (idCategoria != other.idCategoria)
			return false;
		if (nombreLibro == null) {
			if (other.nombreLibro != null)
				return false;
		} else if (!nombreLibro.equals(other.nombreLibro))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", nombreLibro=" + nombreLibro + ", editorial=" + editorial + ", descripcion="
				+ descripcion + ", autor=" + autor + ", idCategoria=" + idCategoria + "]";
	}

}
