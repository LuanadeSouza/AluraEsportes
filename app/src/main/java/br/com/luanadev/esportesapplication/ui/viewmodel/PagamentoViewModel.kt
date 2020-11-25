package br.com.luanadev.esportesapplication.ui.viewmodel

import androidx.lifecycle.ViewModel
import br.com.luanadev.esportesapplication.model.Pagamento
import br.com.luanadev.esportesapplication.repository.PagamentoRepository
import br.com.luanadev.esportesapplication.repository.ProdutoRepository

class PagamentoViewModel(
    private val pagamentoRepository: PagamentoRepository,
    private val produtodRepository: ProdutoRepository) : ViewModel() {

    fun salva(pagamento: Pagamento) = pagamentoRepository.salva(pagamento)
    fun buscaProdutoPorId(id: Long) = produtodRepository.buscaPorId(id)

}