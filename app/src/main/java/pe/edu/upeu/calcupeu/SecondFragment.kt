package pe.edu.upeu.calcupeu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import pe.edu.upeu.calcupeu.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        var valorAnterior=""
        var operador=""

        _binding!!.btn00.setOnClickListener { _binding!!.resultTxt.setText(_binding!!.resultTxt.text.toString()+"0") }
        _binding!!.btn01.setOnClickListener { _binding!!.resultTxt.setText(_binding!!.resultTxt.text.toString()+"1") }
        _binding!!.btn02.setOnClickListener { _binding!!.resultTxt.setText(_binding!!.resultTxt.text.toString()+"2") }
        _binding!!.btn03.setOnClickListener { _binding!!.resultTxt.setText(_binding!!.resultTxt.text.toString()+"3") }
        _binding!!.btn04.setOnClickListener { _binding!!.resultTxt.setText(_binding!!.resultTxt.text.toString()+"4") }
        _binding!!.btn05.setOnClickListener { _binding!!.resultTxt.setText(_binding!!.resultTxt.text.toString()+"5") }
        _binding!!.btn06.setOnClickListener { _binding!!.resultTxt.setText(_binding!!.resultTxt.text.toString()+"6") }
        _binding!!.btn07.setOnClickListener { _binding!!.resultTxt.setText(_binding!!.resultTxt.text.toString()+"7") }
        _binding!!.btn08.setOnClickListener { _binding!!.resultTxt.setText(_binding!!.resultTxt.text.toString()+"8") }
        _binding!!.btn09.setOnClickListener { _binding!!.resultTxt.setText(_binding!!.resultTxt.text.toString()+"9") }

        _binding!!.btnSum.setOnClickListener {
            valorAnterior=_binding!!.resultTxt.text.toString()
            _binding!!.resultTxt.setText("")
            operador="+"
        }
        _binding!!.btnRest.setOnClickListener {
            valorAnterior=_binding!!.resultTxt.text.toString()
            _binding!!.resultTxt.setText("")
            operador="-"
        }
        _binding!!.btnDiv.setOnClickListener {
            valorAnterior=_binding!!.resultTxt.text.toString()
            _binding!!.resultTxt.setText("")
            operador="/"
        }
        _binding!!.btnMult.setOnClickListener {
            valorAnterior=_binding!!.resultTxt.text.toString()
            _binding!!.resultTxt.setText("")
            operador="*"
        }
        _binding!!.btnIgual.setOnClickListener {
            when(operador) {
                "+" -> {
                    var numactual = _binding!!.resultTxt.text.toString()
                    _binding!!.resultTxt.setText((valorAnterior.toFloat() + numactual.toFloat()).toString())
                    valorAnterior = "0"
                    operador = ""
                }
                "-" -> {
                    var numactual = _binding!!.resultTxt.text.toString()
                    _binding!!.resultTxt.setText((valorAnterior.toFloat() - numactual.toFloat()).toString())
                    valorAnterior = "0"
                    operador = ""
                }
                "*" -> {
                    var numactual = _binding!!.resultTxt.text.toString()
                    _binding!!.resultTxt.setText((valorAnterior.toFloat() * numactual.toFloat()).toString())
                    valorAnterior = "0"
                    operador = ""
                }
                "/" -> {
                    var numactual = _binding!!.resultTxt.text.toString()
                    _binding!!.resultTxt.setText((valorAnterior.toFloat() / numactual.toFloat()).toString())
                    valorAnterior = "0"
                    operador = ""
                }
            }
        }

        _binding!!.btnBorrar.setOnClickListener {
            _binding!!.resultTxt.setText("")
        }

        _binding!!.btnPoint.setOnClickListener {
            if (!_binding!!.resultTxt.text.toString().contains(".")){
                _binding!!.resultTxt.setText(_binding!!.resultTxt.text.toString()+".")
            }
        }

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //binding.buttonSecond.setOnClickListener {
        //    findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        //}
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}