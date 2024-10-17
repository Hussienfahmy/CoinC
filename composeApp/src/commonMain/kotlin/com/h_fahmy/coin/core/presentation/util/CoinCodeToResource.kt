package com.h_fahmy.coin.core.presentation.util

import coinc.composeapp.generated.resources.Res
import coinc.composeapp.generated.resources.*
import org.jetbrains.compose.resources.DrawableResource

fun getDrawableForCoin(symbol: String): DrawableResource {
    return when (symbol.uppercase()) {
        "1INCH" -> Res.drawable._inch
        "ST" -> Res.drawable._st
        "XBTC" -> Res.drawable._xbtc
        "AAVE" -> Res.drawable.aave
        "ABBC" -> Res.drawable.abbc
        "ABT" -> Res.drawable.abt
        "AC3" -> Res.drawable.ac3
        "ACT" -> Res.drawable.act
        "ADA" -> Res.drawable.ada
        "ADB" -> Res.drawable.adb
        "ADX" -> Res.drawable.adx
        "AE" -> Res.drawable.ae
        "AEON" -> Res.drawable.aeon
        "AERGO" -> Res.drawable.aergo
        "AGI" -> Res.drawable.agi
        "AION" -> Res.drawable.aion
        "AIT" -> Res.drawable.ait
        "AKRO" -> Res.drawable.akro
        "AKT" -> Res.drawable.akt
        "ALCX" -> Res.drawable.alcx
        "ALEPH" -> Res.drawable.aleph
        "ALGO" -> Res.drawable.algo
        "ALIS" -> Res.drawable.alis
        "ALPHA" -> Res.drawable.alpha
        "ALX" -> Res.drawable.alx
        "AMB" -> Res.drawable.amb
        "AMLT" -> Res.drawable.amlt
        "AMP" -> Res.drawable.amp
        "AMPL" -> Res.drawable.ampl
        "ANC" -> Res.drawable.anc
        "ANJ" -> Res.drawable.anj
        "ANKR" -> Res.drawable.ankr
        "ANT" -> Res.drawable.ant
        "APH" -> Res.drawable.aph
        "APL" -> Res.drawable.apl
        "APPC" -> Res.drawable.appc
        "APW" -> Res.drawable.apw
        "APY" -> Res.drawable.apy
        "AR" -> Res.drawable.ar
        "ARDR" -> Res.drawable.ardr
        "ARK" -> Res.drawable.ark
        "ARMOR" -> Res.drawable.armor
        "ARN" -> Res.drawable.arn
        "ARO" -> Res.drawable.aro
        "ARRR" -> Res.drawable.arrr
        "AST" -> Res.drawable.ast
        "ATMI" -> Res.drawable.atmi
        "ATOM" -> Res.drawable.atom
        "AUC" -> Res.drawable.auc
        "AURA" -> Res.drawable.aura
        "AUTO" -> Res.drawable.auto
        "AVAX" -> Res.drawable.avax
        "AWC" -> Res.drawable.awc
        "AXP" -> Res.drawable.axp
        "BAC" -> Res.drawable.bac
        "BAL" -> Res.drawable.bal
        "BAND" -> Res.drawable.band
        "BAO" -> Res.drawable.bao
        "BAT" -> Res.drawable.bat
        "BAY" -> Res.drawable.bay
        "BBR" -> Res.drawable.bbr
        "BCD" -> Res.drawable.bcd
        "BCH" -> Res.drawable.bch
        "BCHA" -> Res.drawable.bcha
        "BCN" -> Res.drawable.bcn
        "BCO" -> Res.drawable.bco
        "BEL" -> Res.drawable.bel
        "BETA" -> Res.drawable.beta
        "BF" -> Res.drawable.bf
        "BIFI" -> Res.drawable.bifi
        "BIX" -> Res.drawable.bix
        "BLK" -> Res.drawable.blk
        "BLOCK" -> Res.drawable.block
        "BLT" -> Res.drawable.blt
        "BLUE" -> Res.drawable.blue
        "BLZ" -> Res.drawable.blz
        "BNB" -> Res.drawable.bnb
        "BNT" -> Res.drawable.bnt
        "BOND" -> Res.drawable.bond
        "BONDLY" -> Res.drawable.bondly
        "BORA" -> Res.drawable.bora
        "BOX" -> Res.drawable.box
        "BPT" -> Res.drawable.bpt
        "BRD" -> Res.drawable.brd
        "BTC" -> Res.drawable.btc
        "BTC_" -> Res.drawable.btc__
        "BTCP" -> Res.drawable.btcp
        "BTG" -> Res.drawable.btg
        "BTMX" -> Res.drawable.btmx
        "BTO" -> Res.drawable.bto
        "BTS" -> Res.drawable.bts
        "BTT" -> Res.drawable.btt
        "BTU" -> Res.drawable.btu
        "BU" -> Res.drawable.bu
        "BUNNY" -> Res.drawable.bunny
        "BUSD" -> Res.drawable.busd
        "BWT" -> Res.drawable.bwt
        "BZ" -> Res.drawable.bz
        "BZNT" -> Res.drawable.bznt
        "BZRX" -> Res.drawable.bzrx
        "C20" -> Res.drawable.c20
        "C98" -> Res.drawable.c98
        "CAKE" -> Res.drawable.cake
        "CAPP" -> Res.drawable.capp
        "CAR" -> Res.drawable.car
        "CARD" -> Res.drawable.card
        "CBAT" -> Res.drawable.cbat
        "CBT" -> Res.drawable.cbt
        "CDAI" -> Res.drawable.cdai
        "CDT" -> Res.drawable.cdt
        "CEL" -> Res.drawable.cel
        "CELO" -> Res.drawable.celo
        "CELR" -> Res.drawable.celr
        "CENNZ" -> Res.drawable.cennz
        "CETH" -> Res.drawable.ceth
        "CFX" -> Res.drawable.cfx
        "CHAI" -> Res.drawable.chai
        "CHAT" -> Res.drawable.chat
        "CHSB" -> Res.drawable.chsb
        "CHZ" -> Res.drawable.chz
        "CKB" -> Res.drawable.ckb
        "CLO" -> Res.drawable.clo
        "CLOAK" -> Res.drawable.cloak
        "CLOUT" -> Res.drawable.clout
        "CMT" -> Res.drawable.cmt
        "CND" -> Res.drawable.cnd
        "CNX" -> Res.drawable.cnx
        "COMP" -> Res.drawable.comp
        "CONI" -> Res.drawable.coni
        "COSM" -> Res.drawable.cosm
        "COTI" -> Res.drawable.coti
        "COV" -> Res.drawable.cov
        "COVA" -> Res.drawable.cova
        "COVER" -> Res.drawable.cover
        "CPC" -> Res.drawable.cpc
        "CRE" -> Res.drawable.cre
        "CREAM" -> Res.drawable.cream
        "CRED" -> Res.drawable.cred
        "CREP" -> Res.drawable.crep
        "CRO" -> Res.drawable.cro
        "CRPT" -> Res.drawable.crpt
        "CRV" -> Res.drawable.crv
        "CS" -> Res.drawable.cs
        "CSAI" -> Res.drawable.csai
        "CSC" -> Res.drawable.csc
        "CTC" -> Res.drawable.ctc
        "CTXC" -> Res.drawable.ctxc
        "CUSDC" -> Res.drawable.cusdc
        "CV" -> Res.drawable.cv
        "CVC" -> Res.drawable.cvc
        "CVP" -> Res.drawable.cvp
        "CVT" -> Res.drawable.cvt
        "CVX" -> Res.drawable.cvx
        "CWBTC" -> Res.drawable.cwbtc
        "CZR" -> Res.drawable.czrx
        "DADI" -> Res.drawable.dadi
        "DAFI" -> Res.drawable.dafi
        "DAG" -> Res.drawable.dag
        "DAI" -> Res.drawable.dai
        "DASH" -> Res.drawable.dash
        "DAT" -> Res.drawable.dat
        "DATA" -> Res.drawable.data
        "DATX" -> Res.drawable.datx
        "DBC" -> Res.drawable.dbc
        "DCN" -> Res.drawable.dcn
        "DCR" -> Res.drawable.dcr
        "DCT" -> Res.drawable.dct
        "DDD" -> Res.drawable.ddd
        "DENT" -> Res.drawable.dent
        "DERI" -> Res.drawable.deri
        "DFI" -> Res.drawable.dfi
        "DFT" -> Res.drawable.dft
        "DFYN" -> Res.drawable.dfyn
        "DGB" -> Res.drawable.dgb
        "DGD" -> Res.drawable.dgd
        "DGTX" -> Res.drawable.dgtx
        "DIVI" -> Res.drawable.divi
        "DLT" -> Res.drawable.dlt
        "DMT" -> Res.drawable.dmt
        "DNT" -> Res.drawable.dnt
        "DOCK" -> Res.drawable.dock
        "DODO" -> Res.drawable.dodo
        "DOGE" -> Res.drawable.doge
        "DOR" -> Res.drawable.dor
        "DOT" -> Res.drawable.dot
        "DRGN" -> Res.drawable.drgn
        "DROP" -> Res.drawable.drop
        "DTA" -> Res.drawable.dta
        "DTR" -> Res.drawable.dtr
        "DTX" -> Res.drawable.dtx
        "DVF" -> Res.drawable.dvf
        "DXD" -> Res.drawable.dxd
        "DXT" -> Res.drawable.dxt
        "EDG" -> Res.drawable.edg
        "EDO" -> Res.drawable.edo
        "EFI" -> Res.drawable.efi
        "EFX" -> Res.drawable.efx
        "EGLD" -> Res.drawable.egld
        "EGT" -> Res.drawable.egt
        "EKG" -> Res.drawable.ekg
        "EKT" -> Res.drawable.ekt
        "ELA" -> Res.drawable.ela
        "ELEC" -> Res.drawable.elec
        "ELF" -> Res.drawable.elf
        "EMC" -> Res.drawable.emc
        "EMC2" -> Res.drawable.emc2
        "ENG" -> Res.drawable.eng
        "ENJ" -> Res.drawable.enj
        "EOS" -> Res.drawable.eos
        "EOSDAC" -> Res.drawable.eosdac
        "ERN" -> Res.drawable.ern
        "ESD" -> Res.drawable.esd
        "ESP" -> Res.drawable.esp
        "ESS" -> Res.drawable.ess
        "ETC" -> Res.drawable.etc
        "ETH" -> Res.drawable.eth
        "ETN" -> Res.drawable.etn
        "ETP" -> Res.drawable.etp
        "ETZ" -> Res.drawable.etz
        "EVX" -> Res.drawable.evx
        "EWT" -> Res.drawable.ewt
        "EXRN" -> Res.drawable.exrn
        "EXY" -> Res.drawable.exy
        "FAB" -> Res.drawable.fab
        "FCT" -> Res.drawable.fct
        "FEED" -> Res.drawable.feed
        "FEI" -> Res.drawable.fei
        "FET" -> Res.drawable.fet
        "FIDA" -> Res.drawable.fida
        "FIL" -> Res.drawable.fil
        "FILDA" -> Res.drawable.filda
        "FLOW" -> Res.drawable.flow
        "FOTA" -> Res.drawable.fota
        "FOX" -> Res.drawable.fox
        "FRAX" -> Res.drawable.frax
        "FRM" -> Res.drawable.frm
        "FRONT" -> Res.drawable.front
        "FSN" -> Res.drawable.fsn
        "FT" -> Res.drawable.ft
        "FTC" -> Res.drawable.ftc
        "FTM" -> Res.drawable.ftm
        "FTT" -> Res.drawable.ftt
        "FUEL" -> Res.drawable.fuel
        "FUN" -> Res.drawable.fun_coin
        "FXC" -> Res.drawable.fxc
        "FXT" -> Res.drawable.fxt
        "GALA" -> Res.drawable.gala
        "GDC" -> Res.drawable.gdc
        "GEM" -> Res.drawable.gem
        "GEN" -> Res.drawable.gen
        "GNO" -> Res.drawable.gno
        "GNT" -> Res.drawable.gnt
        "GNX" -> Res.drawable.gnx
        "GO" -> Res.drawable.go
        "GOC" -> Res.drawable.goc
        "GOT" -> Res.drawable.got
        "GRIN" -> Res.drawable.grin
        "GRS" -> Res.drawable.grs
        "GRT" -> Res.drawable.grt
        "GSC" -> Res.drawable.gsc
        "GSWAP" -> Res.drawable.gswap
        "GT" -> Res.drawable.gt
        "GTC" -> Res.drawable.gtc
        "GTO" -> Res.drawable.gto
        "GUSD" -> Res.drawable.gusd
        "GVT" -> Res.drawable.gvt
        "GXS" -> Res.drawable.gxs
        "HAKKA" -> Res.drawable.hakka
        "HBAR" -> Res.drawable.hbar
        "HC" -> Res.drawable.hc
        "HEDG" -> Res.drawable.hedg
        "HER" -> Res.drawable.her
        "HEX" -> Res.drawable.hex
        "HIGH" -> Res.drawable.high
        "HIVE" -> Res.drawable.hive
        "HNT" -> Res.drawable.hnt
        "HOT" -> Res.drawable.hot
        "HOT_X" -> Res.drawable.hot_x
        "HPB" -> Res.drawable.hpb
        "HSR" -> Res.drawable.hsr
        "HT" -> Res.drawable.ht
        "HUM" -> Res.drawable.hum
        "HUSD" -> Res.drawable.husd
        "HVN" -> Res.drawable.hvn
        "HYDRO" -> Res.drawable.hydro
        "HYN" -> Res.drawable.hyn
        "HZN" -> Res.drawable.hzn
        "IBAT" -> Res.drawable.ibat
        "ICN" -> Res.drawable.icn
        "ICP" -> Res.drawable.icp
        "ICX" -> Res.drawable.icx
        "IDAI" -> Res.drawable.idai
        "IDEX" -> Res.drawable.idex
        "IETH" -> Res.drawable.ieth
        "IGNIS" -> Res.drawable.ignis
        "IKNC" -> Res.drawable.iknc
        "ILINK" -> Res.drawable.ilink
        "INB" -> Res.drawable.inb
        "INS" -> Res.drawable.ins
        "IOST" -> Res.drawable.iost
        "IOTA" -> Res.drawable.iota
        "IOTX" -> Res.drawable.iotx
        "IQ" -> Res.drawable.iq
        "IREP" -> Res.drawable.irep
        "IRIS" -> Res.drawable.iris
        "ISUSD" -> Res.drawable.isusd
        "IUSDC" -> Res.drawable.iusdc
        "IWBTC" -> Res.drawable.iwbtc
        "IZRX" -> Res.drawable.izrx
        "JNT" -> Res.drawable.jnt
        "JST" -> Res.drawable.jst
        "JUNO" -> Res.drawable.juno
        "KAVA" -> Res.drawable.kava
        "KCS" -> Res.drawable.kcs
        "KDA" -> Res.drawable.kda
        "KEEP" -> Res.drawable.keep
        "KEY" -> Res.drawable.key
        "KICK" -> Res.drawable.kick
        "KIN" -> Res.drawable.kin
        "KLAY" -> Res.drawable.klay
        "KLV" -> Res.drawable.klv
        "KMD" -> Res.drawable.kmd
        "KNC" -> Res.drawable.knc
        "KSM" -> Res.drawable.ksm
        "LAMB" -> Res.drawable.lamb
        "LAND" -> Res.drawable.land
        "LBA" -> Res.drawable.lba
        "LCX" -> Res.drawable.lcx
        "LDO" -> Res.drawable.ldo
        "LEND" -> Res.drawable.lend
        "LEO" -> Res.drawable.leo
        "LINK" -> Res.drawable.link
        "LIT" -> Res.drawable.lit
        "LKY" -> Res.drawable.lky
        "LN" -> Res.drawable.ln
        "LOKI" -> Res.drawable.loki
        "LON" -> Res.drawable.lon
        "LOOKS" -> Res.drawable.looks
        "LOOM" -> Res.drawable.loom
        "LPT" -> Res.drawable.lpt
        "LQD" -> Res.drawable.lqd
        "LQTY" -> Res.drawable.lqty
        "LRC" -> Res.drawable.lrc
        "LSK" -> Res.drawable.lsk
        "LTC" -> Res.drawable.ltc
        "LTO" -> Res.drawable.lto
        "LUN" -> Res.drawable.lun
        "LUNA" -> Res.drawable.luna
        "LXT" -> Res.drawable.lxt
        "LYM" -> Res.drawable.lym
        "MAHA" -> Res.drawable.maha
        "MAID" -> Res.drawable.maid
        "MAN" -> Res.drawable.man
        "MANA" -> Res.drawable.mana
        "MATH" -> Res.drawable.math
        "MATIC" -> Res.drawable.matic
        "MATTER" -> Res.drawable.matter
        "MBC" -> Res.drawable.mbc
        "MCO" -> Res.drawable.mco
        "MCX" -> Res.drawable.mcx
        "MDA" -> Res.drawable.mda
        "MDS" -> Res.drawable.mds
        "MED" -> Res.drawable.med
        "MEDX" -> Res.drawable.medx
        "MET" -> Res.drawable.met
        "MFG" -> Res.drawable.mfg
        "MFT" -> Res.drawable.mft
        "MIM" -> Res.drawable.mim
        "MIR" -> Res.drawable.mir
        "MITH" -> Res.drawable.mith
        "MKR" -> Res.drawable.mkr
        "MLN" -> Res.drawable.mln
        "MNGO" -> Res.drawable.mngo
        "MOD" -> Res.drawable.mod
        "MOT" -> Res.drawable.mot
        "MPL" -> Res.drawable.mpl
        "MTA" -> Res.drawable.mta
        "MTH" -> Res.drawable.mth
        "MTL" -> Res.drawable.mtl
        "MTN" -> Res.drawable.mtn
        "MVC" -> Res.drawable.mvc
        "MVL" -> Res.drawable.mvl
        "MVP" -> Res.drawable.mvp
        "MWAT" -> Res.drawable.mwat
        "MWC" -> Res.drawable.mwc
        "MXM" -> Res.drawable.mxm
        "MYB" -> Res.drawable.myb
        "NANO" -> Res.drawable.nano
        "NAS" -> Res.drawable.nas
        "NAV" -> Res.drawable.nav
        "NCASH" -> Res.drawable.ncash
        "NCT" -> Res.drawable.nct
        "NEAR" -> Res.drawable.near
        "NEBL" -> Res.drawable.nebl
        "NEC" -> Res.drawable.nec
        "NEO" -> Res.drawable.neo
        "NEX" -> Res.drawable.nex
        "NEXXO" -> Res.drawable.nexxo
        "NFT" -> Res.drawable.nft
        "NGC" -> Res.drawable.ngc
        "NIOX" -> Res.drawable.niox
        "NKN" -> Res.drawable.nkn
        "NLG" -> Res.drawable.nlg
        "NMR" -> Res.drawable.nmr
        "NOIA" -> Res.drawable.noia
        "NPER" -> Res.drawable.nper
        "NPXS" -> Res.drawable.npxs
        "NRG" -> Res.drawable.nrg
        "NRVE" -> Res.drawable.nrve
        "NU" -> Res.drawable.nu
        "NULS" -> Res.drawable.nuls
        "NXS" -> Res.drawable.nxs
        "OAG" -> Res.drawable.oag
        "OAX" -> Res.drawable.oax
        "OCEAN" -> Res.drawable.ocean
        "OCN" -> Res.drawable.ocn
        "ODE" -> Res.drawable.ode
        "OGN" -> Res.drawable.ogn
        "OHM" -> Res.drawable.ohm
        "OKB" -> Res.drawable.okb
        "OLT" -> Res.drawable.olt
        "OMG" -> Res.drawable.omg
        "ONE" -> Res.drawable.one
        "ONION" -> Res.drawable.onion
        "ONT" -> Res.drawable.ont
        "OPEN" -> Res.drawable.open
        "OPIUM" -> Res.drawable.opium
        "ORBS" -> Res.drawable.orbs
        "ORC" -> Res.drawable.orc
        "ORN" -> Res.drawable.orn
        "OSMO" -> Res.drawable.osmo
        "OST" -> Res.drawable.ost
        "OVC" -> Res.drawable.ovc
        "OXT" -> Res.drawable.oxt
        "PAI" -> Res.drawable.pai
        "PAINT" -> Res.drawable.paint
        "PAL" -> Res.drawable.pal
        "PAR" -> Res.drawable.par
        "PART" -> Res.drawable.part
        "PAX" -> Res.drawable.pax
        "PAXG" -> Res.drawable.paxg
        "PAY" -> Res.drawable.pay
        "PBR" -> Res.drawable.pbr
        "PBTC" -> Res.drawable.pbtc
        "PENDLE" -> Res.drawable.pendle
        "PERL" -> Res.drawable.perl
        "PERP" -> Res.drawable.perp
        "PICKLE" -> Res.drawable.pickle
        "PIVX" -> Res.drawable.pivx
        "PLAY" -> Res.drawable.play
        "PLDAI" -> Res.drawable.pldai
        "PLR" -> Res.drawable.plr
        "PLUSDC" -> Res.drawable.plusdc
        "PNG" -> Res.drawable.png
        "PNK" -> Res.drawable.pnk
        "PNT" -> Res.drawable.pnt
        "POA" -> Res.drawable.poa
        "POE" -> Res.drawable.poe
        "POKT" -> Res.drawable.pokt
        "POLS" -> Res.drawable.pols
        "POLY" -> Res.drawable.poly
        "POND" -> Res.drawable.pond
        "POOL" -> Res.drawable.pool
        "POWR" -> Res.drawable.powr
        "PPAY" -> Res.drawable.ppay
        "PPC" -> Res.drawable.ppc
        "PPP" -> Res.drawable.ppp
        "PPT" -> Res.drawable.ppt
        "PRE" -> Res.drawable.pre
        "PREMIA" -> Res.drawable.premia
        "PRL" -> Res.drawable.prl
        "PRO" -> Res.drawable.pro
        "PROS" -> Res.drawable.pros
        "PRQ" -> Res.drawable.prq
        "PST" -> Res.drawable.pst
        "QASH" -> Res.drawable.qash
        "QBIT" -> Res.drawable.qbit
        "QI" -> Res.drawable.qi
        "QKC" -> Res.drawable.qkc
        "QLC" -> Res.drawable.qlc
        "QNT" -> Res.drawable.qnt
        "QSP" -> Res.drawable.qsp
        "QTUM" -> Res.drawable.qtum
        "QUICK" -> Res.drawable.quick
        "R" -> Res.drawable.r
        "RAE" -> Res.drawable.rae
        "RARI" -> Res.drawable.rari
        "RAY" -> Res.drawable.ray
        "RCN" -> Res.drawable.rcn
        "RDD" -> Res.drawable.rdd
        "RDN" -> Res.drawable.rdn
        "REN" -> Res.drawable.ren
        "REP" -> Res.drawable.rep
        "REQ" -> Res.drawable.req
        "RESOURCE_NEW" -> Res.drawable.resource_new
        "RESOURCE_SUPER" -> Res.drawable.resource_super
        "REV" -> Res.drawable.rev
        "RFOX" -> Res.drawable.rfox
        "RHOC" -> Res.drawable.rhoc
        "RIF" -> Res.drawable.rif
        "RLC" -> Res.drawable.rlc
        "ROOK" -> Res.drawable.rook
        "ROSE" -> Res.drawable.rose
        "RPX" -> Res.drawable.rpx
        "RSR" -> Res.drawable.rsr
        "RSV" -> Res.drawable.rsv
        "RUNE" -> Res.drawable.rune
        "RVN" -> Res.drawable.rvn
        "S" -> Res.drawable.s
        "SAI" -> Res.drawable.sai
        "SALT" -> Res.drawable.salt
        "SAN" -> Res.drawable.san
        "SAND" -> Res.drawable.sand
        "SAR" -> Res.drawable.sar
        "SCRL" -> Res.drawable.scrl
        "SCRT" -> Res.drawable.scrt
        "SDT" -> Res.drawable.sdt
        "SEELE" -> Res.drawable.seele
        "SEFI" -> Res.drawable.sefi
        "SEM" -> Res.drawable.sem
        "SFI" -> Res.drawable.sfi
        "SFP" -> Res.drawable.sfp
        "SHIB" -> Res.drawable.shib
        "SHR" -> Res.drawable.shr
        "SHUF" -> Res.drawable.shuf
        "SIA" -> Res.drawable.sia
        "SKL" -> Res.drawable.skl
        "SKY" -> Res.drawable.sky
        "SLT" -> Res.drawable.slt
        "SMART" -> Res.drawable.smart
        "SNC" -> Res.drawable.snc
        "SNGLS" -> Res.drawable.sngls
        "SNM" -> Res.drawable.snm
        "SNT" -> Res.drawable.snt
        "SNX" -> Res.drawable.snx
        "SOL" -> Res.drawable.sol
        "SOUL" -> Res.drawable.soul
        "SOV" -> Res.drawable.sov
        "SPN" -> Res.drawable.spn
        "SRM" -> Res.drawable.srm
        "STAKE" -> Res.drawable.stake
        "STEEM" -> Res.drawable.steem
        "STEP" -> Res.drawable.step
        "STETH" -> Res.drawable.steth
        "STMX" -> Res.drawable.stmx
        "STORJ" -> Res.drawable.storj
        "STORM" -> Res.drawable.storm
        "STPT" -> Res.drawable.stpt
        "STRAT" -> Res.drawable.strat
        "STX" -> Res.drawable.stx
        "SUB" -> Res.drawable.sub
        "SUQA" -> Res.drawable.suqa
        "SUSHI" -> Res.drawable.sushi
        "SUTER" -> Res.drawable.suter
        "SWAP" -> Res.drawable.swap
        "SWTH" -> Res.drawable.swth
        "SXDT" -> Res.drawable.sxdt
        "SXP" -> Res.drawable.sxp
        "SYS" -> Res.drawable.sys
        "TBTC" -> Res.drawable.tbtc
        "TCT" -> Res.drawable.tct
        "TEL" -> Res.drawable.tel
        "TFUEL" -> Res.drawable.tfuel
        "THC" -> Res.drawable.thc
        "THETA" -> Res.drawable.theta
        "THR" -> Res.drawable.thr
        "TIO" -> Res.drawable.tio
        "TITAN" -> Res.drawable.titan
        "TKN" -> Res.drawable.tkn
        "TKY" -> Res.drawable.tky
        "TNB" -> Res.drawable.tnb
        "TNC" -> Res.drawable.tnc
        "TNT" -> Res.drawable.tnt
        "TOMO" -> Res.drawable.tomo
        "TORN" -> Res.drawable.torn
        "TPAY" -> Res.drawable.tpay
        "TRAC" -> Res.drawable.trac
        "TRB" -> Res.drawable.trb
        "TRIBE" -> Res.drawable.tribe
        "TRIG" -> Res.drawable.trig
        "TRTL" -> Res.drawable.trtl
        "TRU" -> Res.drawable.tru
        "TRX" -> Res.drawable.trx
        "TRYB" -> Res.drawable.tryb
        "TUBE" -> Res.drawable.tube
        "TUSD" -> Res.drawable.tusd
        "TWT" -> Res.drawable.twt
        "UBQ" -> Res.drawable.ubq
        "UBT" -> Res.drawable.ubt
        "UFT" -> Res.drawable.uft
        "ULT" -> Res.drawable.ult
        "UMA" -> Res.drawable.uma
        "UNCX" -> Res.drawable.uncx
        "UNFI" -> Res.drawable.unfi
        "UNI" -> Res.drawable.uni
        "UNN" -> Res.drawable.unn
        "UOS" -> Res.drawable.uos
        "UPP" -> Res.drawable.upp
        "USDC" -> Res.drawable.usdc
        "USDP" -> Res.drawable.usdp
        "USDS" -> Res.drawable.usds
        "USDT" -> Res.drawable.usdt
        "UTK" -> Res.drawable.utk
        "UUU" -> Res.drawable.uuu
        "VALUE" -> Res.drawable.value
        "VERI" -> Res.drawable.veri
        "VEST" -> Res.drawable.vest
        "VET" -> Res.drawable.vet
        "VGX" -> Res.drawable.vgx
        "VIA" -> Res.drawable.via
        "VIB" -> Res.drawable.vib
        "VIBE" -> Res.drawable.vibe
        "VIDT" -> Res.drawable.vidt
        "VIKKY" -> Res.drawable.vikky
        "VIN" -> Res.drawable.vin
        "VITE" -> Res.drawable.vite
        "VIU" -> Res.drawable.viu
        "VLX" -> Res.drawable.vlx
        "VRS" -> Res.drawable.vrs
        "VSP" -> Res.drawable.vsp
        "VSYS" -> Res.drawable.vsys
        "VTC" -> Res.drawable.vtc
        "WABI" -> Res.drawable.wabi
        "WAN" -> Res.drawable.wan
        "WAVES" -> Res.drawable.waves
        "WBTC" -> Res.drawable.wbtc
        "WCT" -> Res.drawable.wct
        "WEXPOLY" -> Res.drawable.wexpoly
        "WHALE" -> Res.drawable.whale
        "WIB" -> Res.drawable.wib
        "WING" -> Res.drawable.wing
        "WINGS" -> Res.drawable.wings
        "WOO" -> Res.drawable.woo
        "WPR" -> Res.drawable.wpr
        "WRX" -> Res.drawable.wrx
        "WTC" -> Res.drawable.wtc
        "WXT" -> Res.drawable.wxt
        "XAS" -> Res.drawable.xas
        "XCHF" -> Res.drawable.xchf
        "XEM" -> Res.drawable.xem
        "XHV" -> Res.drawable.xhv
        "XIN" -> Res.drawable.xin
        "XLM" -> Res.drawable.xlm
        "XLQ" -> Res.drawable.xlq
        "XMARK" -> Res.drawable.xmark
        "XMR" -> Res.drawable.xmr
        "XMX" -> Res.drawable.xmx
        "XNK" -> Res.drawable.xnk
        "XNS" -> Res.drawable.xns
        "XOR" -> Res.drawable.xor
        "XRD" -> Res.drawable.xrd
        "XRP" -> Res.drawable.xrp
        "XSN" -> Res.drawable.xsn
        "XSR" -> Res.drawable.xsr
        "XTZ" -> Res.drawable.xtz
        "XVG" -> Res.drawable.xvg
        "XYO" -> Res.drawable.xyo
        "XZC" -> Res.drawable.xzc
        "YFI" -> Res.drawable.yfi
        "YOYO" -> Res.drawable.yoyo
        "ZAI" -> Res.drawable.zai
        "ZB" -> Res.drawable.zb
        "ZCO" -> Res.drawable.zco
        "ZEC" -> Res.drawable.zec
        "ZEN" -> Res.drawable.zen
        "ZIL" -> Res.drawable.zil
        "ZKS" -> Res.drawable.zks
        "ZRX" -> Res.drawable.zrx
        else -> Res.drawable.question_sign
    }
}