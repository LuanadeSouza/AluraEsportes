package br.com.luanadev.esportesapplication.repository

import androidx.lifecycle.LiveData
import br.com.luanadev.esportesapplication.database.dao.ProdutoDAO
import br.com.luanadev.esportesapplication.model.Produto

class ProdutoRepository(private val dao: ProdutoDAO) {

    fun buscaTodos(): LiveData<List<Produto>> = dao.buscaTodos()

    fun buscaPorId(id: Long): LiveData<Produto> = dao.buscaPorId(id)

}
