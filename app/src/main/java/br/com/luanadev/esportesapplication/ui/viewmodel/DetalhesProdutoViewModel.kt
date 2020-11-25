package br.com.luanadev.esportesapplication.ui.viewmodel

import androidx.lifecycle.ViewModel
import br.com.luanadev.esportesapplication.repository.ProdutoRepository

class DetalhesProdutoViewModel(
    produtoId: Long,
    repository: ProdutoRepository
) : ViewModel() {

    val produtoEncontrado = repository.buscaPorId(produtoId)

}