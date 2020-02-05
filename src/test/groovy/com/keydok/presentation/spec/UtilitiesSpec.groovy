package com.keydok.presentation.spec

import com.keydok.presentation.util.StringUtil

import spock.lang.Specification
import spock.lang.Unroll

class UtilitiesSpec extends Specification {

	def "suma correcta de dos numeros enteros"() {
		given: "dos numeros enteros: 5 y 8"
		def sumando1 = 5
		def sumando2 = 8

		expect:"que la suma de ambos sea igual a 13"
		sumando1 + sumando2 == 13
	}

	def "longitud de cadena nula es impar"() {
		given: "una cadena con valor nulo"//escenario
		def cadena = null

		when: "validamos su longitud"//estimulo
		def esPar = new StringUtil().isLengthEven(cadena);

		then: "el resultado debe ser impar"//resultado(s) esperado(s) [prueba] [Postcondiciones]
		!esPar
	}
}
