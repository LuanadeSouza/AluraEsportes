package br.com.luanadev.esportesapplication.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import br.com.luanadev.esportesapplication.model.Produto
import br.com.luanadev.esportesapplication.repository.ProdutoRepository

class ProdutosViewModel(private val repository: ProdutoRepository) : ViewModel() {

    fun buscaTodos(): LiveData<List<Produto>> = repository.buscaTodos()

}
