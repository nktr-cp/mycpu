package common

import chisel3._
import chisel3.util._

object Instructions {
	// load, store
	val LW		= BitPat("b?????????????????010?????0000011")
	val SW		= BitPat("b?????????????????010?????0100011")

	// add
	val ADD		= BitPat("b0000000??????????000?????0110011")
	val	ADDI	= BitPat("b?????????????????000?????0010011")

	// substraction
	val SUB		= BitPat("b0100000??????????000?????0110011")

	// logical operation
	val AND     = BitPat("b0000000??????????111?????0110011")
	val OR      = BitPat("b0000000??????????110?????0110011")
	val XOR     = BitPat("b0000000??????????100?????0110011")
	val ANDI    = BitPat("b?????????????????111?????0010011")
	val ORI     = BitPat("b?????????????????110?????0010011")
	val XORI    = BitPat("b?????????????????100?????0010011")

	// shift
	val SLL     = BitPat("b0000000??????????001?????0110011")
	val SRL     = BitPat("b0000000??????????101?????0110011")
	val SRA     = BitPat("b0100000??????????101?????0110011")
	val SLLI    = BitPat("b0000000??????????001?????0010011")
	val SRLI    = BitPat("b0000000??????????101?????0010011")
	val SRAI    = BitPat("b0100000??????????101?????0010011")

	// compare
	val SLT     = BitPat("b0000000??????????010?????0110011")
	val SLTU    = BitPat("b0000000??????????011?????0110011")
	val SLTI    = BitPat("b?????????????????010?????0010011")
	val SLTIU   = BitPat("b?????????????????011?????0010011")

	// condition
	val BEQ     = BitPat("b?????????????????000?????1100011")
	val BNE     = BitPat("b?????????????????001?????1100011")
	val BLT     = BitPat("b?????????????????100?????1100011")
	val BGE     = BitPat("b?????????????????101?????1100011")
	val BLTU    = BitPat("b?????????????????110?????1100011")
	val BGEU    = BitPat("b?????????????????111?????1100011")

	// jump
	val JAL     = BitPat("b?????????????????????????1101111")
	val JALR    = BitPat("b?????????????????000?????1100111")

	// load immediate
	val LUI     = BitPat("b?????????????????????????0110111")
	val AUIPC   = BitPat("b?????????????????????????0010111")

	// CSR
	val CSRRW   = BitPat("b?????????????????001?????1110011")
	val CSRRWI  = BitPat("b?????????????????101?????1110011")
	val CSRRS   = BitPat("b?????????????????010?????1110011")
	val CSRRSI  = BitPat("b?????????????????110?????1110011")
	val CSRRC   = BitPat("b?????????????????011?????1110011")
	val CSRRCI  = BitPat("b?????????????????111?????1110011")

	// exception
	val ECALL   = BitPat("b00000000000000000000000001110011")

	// vector
	val VSETVLI = BitPat("b?????????????????111?????1010111")
	val VLE     = BitPat("b000000100000?????????????0000111")
	val VSE     = BitPat("b000000100000?????????????0100111")
	val VADDVV  = BitPat("b0000001??????????000?????1010111")

	// custom
	val PCNT    = BitPat("b000000000000?????110?????0001011")
}
