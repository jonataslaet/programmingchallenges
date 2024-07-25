package com.github.jonataslaet.mycodeschool;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTests {

    private static Map<Integer, BigDecimal> expectedMap;

    @BeforeAll
    static void setup() {
        expectedMap = new HashMap<>();
        expectedMap.put(0, new BigDecimal("1"));
        expectedMap.put(1, new BigDecimal("1"));
        expectedMap.put(2, new BigDecimal("2"));
        expectedMap.put(3, new BigDecimal("6"));
        expectedMap.put(4, new BigDecimal("24"));
        expectedMap.put(5, new BigDecimal("120"));
        expectedMap.put(6, new BigDecimal("720"));
        expectedMap.put(7, new BigDecimal("5040"));
        expectedMap.put(8, new BigDecimal("40320"));
        expectedMap.put(9, new BigDecimal("362880"));
        expectedMap.put(10, new BigDecimal("3628800"));
        expectedMap.put(11, new BigDecimal("39916800"));
        expectedMap.put(12, new BigDecimal("479001600"));
        expectedMap.put(13, new BigDecimal("6227020800"));
        expectedMap.put(14, new BigDecimal("87178291200"));
        expectedMap.put(15, new BigDecimal("1307674368000"));
        expectedMap.put(16, new BigDecimal("20922789888000"));
        expectedMap.put(17, new BigDecimal("355687428096000"));
        expectedMap.put(18, new BigDecimal("6402373705728000"));
        expectedMap.put(19, new BigDecimal("121645100408832000"));
        expectedMap.put(20, new BigDecimal("2432902008176640000"));
        expectedMap.put(21, new BigDecimal("51090942171709440000"));
        expectedMap.put(22, new BigDecimal("1124000727777607680000"));
        expectedMap.put(23, new BigDecimal("25852016738884976640000"));
        expectedMap.put(24, new BigDecimal("620448401733239439360000"));
        expectedMap.put(25, new BigDecimal("15511210043330985984000000"));
        expectedMap.put(26, new BigDecimal("403291461126605635584000000"));
        expectedMap.put(27, new BigDecimal("10888869450418352160768000000"));
        expectedMap.put(28, new BigDecimal("304888344611713860501504000000"));
        expectedMap.put(29, new BigDecimal("8841761993739701954543616000000"));
        expectedMap.put(30, new BigDecimal("265252859812191058636308480000000"));
        expectedMap.put(31, new BigDecimal("8222838654177922817725562880000000"));
        expectedMap.put(32, new BigDecimal("263130836933693530167218012160000000"));
        expectedMap.put(33, new BigDecimal("8683317618811886495518194401280000000"));
        expectedMap.put(34, new BigDecimal("295232799039604140847618609643520000000"));
        expectedMap.put(35, new BigDecimal("10333147966386144929666651337523200000000"));
        expectedMap.put(36, new BigDecimal("371993326789901217467999448150835200000000"));
        expectedMap.put(37, new BigDecimal("13763753091226345046315979581580902400000000"));
        expectedMap.put(38, new BigDecimal("523022617466601111760007224100074291200000000"));
        expectedMap.put(39, new BigDecimal("20397882081197443358640281739902897356800000000"));
        expectedMap.put(40, new BigDecimal("815915283247897734345611269596115894272000000000"));
        expectedMap.put(51, new BigDecimal("1551118753287382280224243016469303211063259720016986112000000000000"));
//        expectedMap.put(9999, new BigDecimal("2846259680917054518906413212119868890148051401702799230794179994274411340003764443772990786757784775815884062142317528830042339940153518739052421161382716174819824199827592418289259787898124253120594659962598670656016157203603239792632873671705574197596209947972034615369811989709261127750048419884541047554464244213657330307670362882580354896746111709736957860367019107151273058728104115864056128116538532596842582599558468814643042558983664931705925171720427659740744613340005419405246230343686915405940406622782824837151203832217864462718382292389963899282722187970245938769380309462733229257055545969002787528224254434802112755901916942542902891690721909708369053987374745248337289952180236328274121704026808676921045155584056717255537201585213282903427998981844931361064038148930449962159999935967089298019033699848440466541923625842494716317896119204123310826865107135451684554093603300960721034694437798234943078062606942230268188522759205702923084312618849760656074258627944882715595683153344053442544664841689458042570946167361318760523498228632645292152942347987060334429073715868849917893258069148316885425195600617237263632397442078692464295601230628872012265295296409150830133663098273380635397290150658182257429547589439976511386554120812578868370423920876448476156900126488927159070630640966162803878404448519164379080718611237062213341541506599184387596102392671327654698616365770662643863802984805195276953619525924093090861447190739076858575593478698172073437209310482547562856777769408156407496227525499338411280928963751699021987049240561753178634693979802461973707904186832993101655415074230839317687836692369484902599960772968429397742753626311982541668153189176323483919082100014717893218422780513518173492190114624687576983537344145601312261522139117875968836736408720793700299203827919803870237207803914031236899760815284030605111670948472222487038919999344207139583698306396223207911562404425080891991431983712044559834404755675948921210149815245454359428541439084356441998422485547853216362403009844285533182925315420655123707970581639346029624769701038874220644153662673371542870078912274934068433644288984710084064160009362393526124803797529334392876439831639031277645072247926785170082666959838952615075900734921519759265919270887320259406638211880198885474826604834225645770574397312225970067193606176351357952982179429079770532728326750148802444352868164502616566283754651900617187344226043891929850607151539003110668472736013581670643786175675743918437647965813610059963868955233464878174614324357322486432679848198145843270303589550842053478849336458248259203328808902578238823326577020524897093704721021424841334246526820680673231421448385407418213962184687010835958294696523563276487047571835161687923506836627174371191572336114307012112076760869785155972184648598591864364171685089962551682091079357023111851817477501080462258552131476489749066075287708289766751495100968232968973200062239288805665803614031128546592908407803397490066495320587316494809388381619865885082738246803489786475711667989042356801830350413387573197263089790943571068779730163391808786847494363353389337358690640584841782806519627582643442925805842221294764940294862267076183298822900407239040373316820741741325165668844307933944701920890562078838758534251282095735930701819770834016381763827856253951682542664461494104471157953326237281546879408042371858742302620026422182269418862621210729777665740101837618228013685758644218586301153984371229910701009406192941322320277319395946700671369537709789777811828824244292086481613417956201747183160968766104314049795819823644580736820940402221118153005143338707660706314961610777111744805955276434833338574404021275703185152729837743592187855855279559102866445791736200722185814330997729477892372071794285775627130092398239792195758119726474264287826668235391568785727162014619224426626670840076566562580710947439874011077281166991880626872662656558334566500789030905065607463307802715853081769122377281351058452732659162621964762057143488021563081525900534372114100030303924286645720732847348171203416818632896886504828736793339844397123673508452734019630942769765268417017499075694798275782583522999431563332210743913155012445900532470268031291239229797903041758782339862237353505464264691350250395100923928658510868208807066273473320035499572039708648806604092985460700633940988583634986546613672788074876470070245879011804651829611127709060901615202211146154315831766995706097461808535939040006789287854882785093863735370390404941268461899127287156265500127083303995025787993170543188275265922581494895074663997600731692731083173588305661261478299766318807006304463242911226069193127888156622159152327045769586751282199093894268660196390448971891859747292531032248021054384104432582847283058429780416240510811032691400190056878439634150269652104892027214023216023489858882737142869533968175510628747090747371818801422348724849855819843909465170836436899430618965024328835327966719018452762055108570762620424450962332320474470783119043449935144262550170177101737955112474615947173186270156557126629585512507771173833820841970589336732372445328045653717851496030880258028406784780941464183865922665280686797884325066053794304625028710510492934726747126749989263462735816714693506049511034075540465817039348104675848562596776795976829940933402638726937836532091228771807745115262264254877183546110888636084327280622777664309728387905672861803604863346489337143941525025945965250152095953615797713559579496572977565090269442808847976127666484700361964890604376193469427044407021531794358383105140491546260872848667875054167414673164899935638131286693142761686353730563458662695789456827506581023595081488877895507393936534193736570084831850447568221544406759920313807707353997803633926733454954929666875992253089389808643060653296179316402961249267308063803187391259615113189035935126648081856836677028653774239074658239091095551717977058079778928975249023073780175314268036391424472025772889178495007811788933662975043680421466819782427298069757939174222945668318581567681628879787062453124665172762275829549342148365886891929958740209569600024356030528982986638689207699283403054971026651432230612523191513184387690382370620539920693394371688046642971147674356448637502684769814885310535406332884506201217330263067648132293156104355194176105071244902487327727311209194586513749319096516249769165755381219856643220797866630039893866023860735785811439471587280089337416503379296583261843607313332752602360511552422722844725146386326936976376251019671438012569122778442842699944082915221590469443728249865808520518657629299277550883312867263841871327778087444664387535264473356244113944762878097465068395298210817496795883645227334469487379347179071006497823646601668057203429792920744682232284866583952221144685957285840386337727803022759153049786587391951365024627419589908837438733159428737202977062020712021303857217593321116241333042277374241635355358797706530964768588607730143277829032889479581840437885856777293209447677866935753746004814237674119418267163687048105691115621561435751629052735122435008060465366891745819654948260861226075029306276147881326895528073614902252581968281505103331813212965966495815903042123877564599097329672806668384916625794974792290536184556374103479143077156116865048429249028110299252967873529876782926904078877848026247922275073594840581743908625187794689004594206016860514277224448627246991114620014988066272353883780938062854438476305323507013202802948839200813213544645005613498701783427110615817728981929065649868808104556223370306725425127727733028349843359577257595622470370779338714659303308862969944031833266579751467650271734629888377739784821870071802674126599715872803544047843247867490712792167289852358848694354669225510133760637791516459725425711696847733995115899834908188828126398440050554621006698879261455821456531969690982725393451576040861347625877816586729441077535882416231577908253805474693354058246971767432452345149848302717039654388773763735819173658245427334749042426294601129988191656371384711184915691505476814041174980145426571239420442544102807580600138819865061375928853903892264432294799028648284009959867596358099911269536760152717308685275657214758350712229829652956491783507175083574136228254505562027096941747679925922977488862741131458767614753145689532809311705269648641018740767329698664923643738256547502281647192681555988319662984830777666684062231431588438491051905828181674076446303330011971029303645586659465186907447525083784198762299041591179368279976065418608872162665488649234439103092325691063377596973905178112276466848679173604940439370333935190060938726839729924647848372727477097746669359978485712015678900024194726922097498412732314740154998092038145982141648117635714780155423159966783853485448640693641055691353133523118405358134894093819182189869482538396098994282202759933963520621770534357207339625057421676946510160849560143930324430427157609952730868460920442222610315422998444480211009816133382482737521899873820531516492713449810595015997480057159191220215448774875010347324619063394130303089239941198500622590218416440998817321432442210855424862089625026060439818018902631778114661745499977144066523286384636384700165561815386109818811118173419130550502486034585675558563751172977429932907494423657966833270091836733897734790175924888566037995277154056908301731172389414032615961229291222519109594874380567338127853861649184278693841755689804710085986837203361517515809702256627520016095619222992540175987852203854591377178397638981119848580329104875166692119510451489667776159824946872742066343759320785261892268728552767132488326779415291283916540796834419023909480367668870783801136704275397139620142478493519673530144440403782352667443755674088302522574527380620998045123318810272901204299798900542312621796813523775804116251145917599327913417650729282676223689729196052828967522352142523421724784186931739746041187763460462563713530980159061773675871533680395855905482736187611215138467343288432509004564535818668190510873179134621573033954058098717201384437709927953279767553109938136584040355679573189414197651143632552627063974314652634812003272009675566770192624258505777061789379823109698678844854665952732706167030891827720643255191939367359134603775708319318084592956515887524459760172945572050559508592917550651011566507552163514231815354817688419603208505087149627049401768418398058259403818259398646126027595424743337622625628715391606902509898507079866062173220016359393861147539456140663567571852661703147145351675300749921386520776852382488460062373589660805495165240648054729586991869435881119783368014148807832121345715236012406592220850891295690783537057673467166786378090881128345039578481221210111725071838335908388618757466120131729821713107294473765626517231069488442549836951414738389247774232094020783120080723532628805390626601818605042493878867787249550325542428422659627105069264607176746750233780567189345011073737703411934611337403386536467513673366139473155021145710467116144525332485019790108343164198999841404504490113016375952067571556750948524358026910407763721099867162425479538531285288993095657072921867352321666609787498963536261052982147256948279999622082577584098845848425039118944760872968518498397636791824226657116716658015791450081165719220023375976531749592239788498281470550619068927562521046218566130580025560797460972671503332703231002527464042875555654688376583880254322740350743168427862063769705479172648437817444636152057093322858728431569075625556930555881882260359000673933995250437988747093507927618111627630977125798397599652661212031749588205943575488386228250840140888572058399240097121921254807409775297427877591256602644348271364723184912518086627870862611669998963481240580368479458736482012465366322888901163657227088775773615200345010226889018910167357205866141001172366476265783539636429781901164705617027963192233229422873930923333074825893762619899759653008413538324112589963962944512908280202322549893662750649953083892563224679469596066904690668629264500621974012178289987297970485902177506009289332895727239201958999447194514736085077040072571743931814846190940626954528503052634100056502222615230936488288712204645426770057714899433514716250425236517371026606864725345812018668327395368254745653655359754668578870005698836028668645074025699308748344109408608630370790829524057673168494185581048247530475892339280157130282410623499994593239052140985655956566134600339615051516475885274221473251799954897799284952274602985566670081187120085615501645740048417021030303899633925333746655681782441073740933691929410463230773199475982630738349960077037241044628541464870411627389564983455516216568511455138382204700548399667170624646756610129138204890912111722938624425315891306698746204558724480605282937814830262216454228042175776076236545982822307081550346940493831775505330509469899947611941923128072180721696437843331360676067696518713839433877248549368906184570057204369666646508073449581449596630624669867983287258630006421522021017181391732527517367226262145494546850600633469271383831171584975309264325248696022005909980266376538622546326516841496330636954808655110125675771789061669475834404348621848536959160217203045618349752416203992644133165188476860683064200485855792447334029014258887640371251864222901633369158506327372719959636291278334478621888787100953375355105468898023637826371492691328956433944089947012145213457211771565759145173489519501680062135392717541984387616354347980692088666622709951237170624192491428257645312576993973534167304686458518197966823201569379268492699998399241357194149688227370402282080517180800340048061526179201397894518629529055844070373830053355242115390338518582936677919061011630623367314441920289385720185556959633083361545029042482230929708712478800201738307206048268015667539759378993179351579995892956215630733841629459990027673083282771659506421796652319043925054322675373181175531547678073947033893118510729772431837897267495745577818334549594231735355829104696731539127597568728186169116108315633723263996888149054394326119718227499679117662855340186019831580962998179110720880499229201606205906727127359946187163494577499580533794718710545645257939602421025913641552839839520177301271251489205106170822800833998566578664692073711426968230177041632482947940955869469908937916519100630518535210234518979812761914306186436270308197712499275105673290948120205774710068770337970893422920718390374416750349381883634222928494679066028567429325164256904436347308765679705659567728529108124273315440658019980271157912625417279745286257486592193329380591523952473551888711986039131965428757629019050396408356024627753431440915564218172945994159606197962263324271586342597794734868207480202153873472970799975333298778553105382016216979188038075300633435076614773713593936265190522224252814108474704529568864775791350216092204034844914995077874310718965572549265128269348951579507548617234139461036517661675032994864224403965951188226498131592508018512638663530862222349109462905931782940819564048470245653830543205650692442267186325530764076187208678039171135636350126952509129102049604282323262899650275895105284436817741573094187489442806542756143097582812769812493699331302894667056041408430894223114091272223814847036434101963041363073677106003815959082974641011442135832104257435835022073717321974508903557318735044582723877072827140616299791962935722410447715505165253586754410939507921836901526113844038268005415092434651171143647789944455399365366772758956571398750554299082458560951003693466310067371470802992765693343550092718985405010991747497999155439203190896196761544468604817540069568947146392824538380701044418104550617130516058435581752103233846582920107103006112428340745860700606019483055136486702102036470847080742270437189370696568879561792871304522451684202740202196641560528033506129355873907939352440409258424838060717744460996403522189102296190903256904238137449249490689231433088422439963139639154585406528632646880758114874837140828417645522638631352026489401626249480238856823159910295262033712644927990193821113451844638754451639123937797419057664991176423763772228280231846573805012127780968031569147726491025750350875879224811022354452441087244856570075518713214659209354850455282917074959677540445077949483637175606232692575741281311024191037333808043432531088469483155572940226539497291381758133861945705779956180875595141364490761310961715592837658584003648937407682225752393598873108168966768828740383719282769043151410699767830381908569071309193134084601951114748276635072467653492204005862667763293551663193962249897991270800446598226489912522681312430052810499505859567652712359149444261255443761864502920288135858287178957722411638081516183160312972879698748013982862164562919615309635833731361972477333235302546657119690261123738062903024290427579454903002266084744651316174169191685174646494545969600533088525279208347249523547311067410909922354105550629968764215395124935598631134666172511689078563332893556915044948518911348830187636510063850256591643302192856559626391438289506832483872716561656011153151705522295576594497245478881553231641745326716797886114116535559758833197963807096299888076730361694031773644814042786778425123244997469342134821717959519069820460299717200117485730388971920559741474245301113586976625660777097022563326170110846378479555525850457805887944075606497412797453091841840520755852646220882148364675465223760921078753919045468485234975998604494332282807312067992240247750751410589077462733431909125545135222532927591384204738460305616315423655293531227838975944651578733734346317228000103138042548140402209058040505600386093740343506886308143468384890070893856505002756905967806940469843518453513414103161513368304371478664292538971716597862901072840075893970038831774264816372511327736992682770946534258359611188195509246206215397812119724476262377153445204806981908252494396396225111383117742897853582559083249048049751604710425756975344255151577981560037084723060348475397751368839040431601748624887133931181852302942542567620248568839397083674878845378917257414515591791903539853507720090059497935293945963121344550336826069005982871772353337522194191554730374206234326289296839701505889219111204924986479205341087234911543098718216005576220907573230462610659774494765834631302559863631502995967235247694397546253020678819330437228480020930535415564066483856937814460313869756345920023346260699595551348475414789118083032981642158745292295267893792564775202905267534935667374429318267337457164246540774826790104677875908540813053144717645586989416966894043648995246524744398834958387120629648541335755381341950049874381336906270397387458660429687159582071576659982660731700562446554176302450134915956728894261974614449690867165585978272922870272377483509736290101913041781273577303778180408158913600520731580694103430500318434934236026924473306001386111978177447266960892832105254311649603342010203260386367253288964833340586220484361657536200146840547664966647356697957295339480913826370332422093083936695498068824049162206314791149464204250002245041342555856193744290525725243632005448744152430730521507049102043407657247686509575117412541372953164452176557723534860182156683335252053283000010834400876226684381702323560564515825695417735919781364997555960191256774494271798636004584740520929008939731527602430495165386443138814787697754147875743261015987970975885562580676619797309847246076948482112794842797653660705505163910441502255442032972129203300935335668729459591232796588637648689418843364054849400957496579165768721392733015355509786511476794739969062318487837751546261382365166595633720934570820830184048279700572807143292572757743622958704736164160973181724159420427036606640408974024552153072522738863724185964645522367326041116459846402001021692082331515538882107152719126787653179507190820452510044782129131854405481449415186711420710369389112912501275085346633771774937601654345469639004271112982925509683042066572536427947220002083531388370878164995718971762933879485427127688265200376632592456161486874489747151936621927566585246211445740701067538042756418444083480520383826505260169858406008478842242188785692789775181044280547442722945516742033568646060997797312495043332142520505367579049952078359765041537900113257953604065517265487902217359544415113942923164895066317781303905746208244917192131186412963370466140645690017894235673877552313095278591277453324185544248448449366421073134881918064018922231730215664581347318644999790578166209146987071803938888578128074022636360229411435486987140214357205594773089280865367892020193510260536156792448327674947611785831607186571031084220056025954511519139130911954444784436103274187610233884339168758923342379085984196826652561062875123757231849147495194598572889793498179176182265248040823712810979077263886428606791708228857585270347083971456161992624784479469279499684594563238270229736417350343078319411569824782001329085120287847480586018896004590174597405563073271448767908528886797880997069524068100662561144001498341358088973724684406494885707416768791641322420537365406733018639249791091547478595916386559750709058117592489950221479925094563558251431581446406013428349042279835793965925898520076384564668164073268192834600776728587628490006887456463927496441590403403367233781449159703294178729415506105412951540015939385166392932567742955754948004665827357965399094023354364464937682727254187362754753297680819032533614108643308423777173899522153676309530204590243869463270289529399448301357758908121488455849381987450592091406720952246909626307694175334098369885936370031497372897799636001862650017492929008793118999782296371230664229799616358257260011228898364765141804597577004212083394936465964733646428904449932539622709190737370577205132281595786322759191278605429786295318861555980472816071086413280358540016005557568685579178597789919790265659262128300722535140152597356930072901539221111686850474040217217444205173800025136100049453411932433166834424312596309881239696220235885839558783168519483312665357735324437993568321526917704224903457453485891381258268136690892947680905263556063811966130606393693841181771354592988431723291223626245886839420288998169356116986542988477651311822766252673997880881601047065154233501567135374481708623431466253119029104015226292710409928507241884332900727779475411163755217656358931632663604938121840183751281888477116897547948376766408484275362307401954218321798549626066659034792581634239267094783990706292316653503728501975132481380383707089463892547088703908572358100613062864666471000610435211577892661343221465531141188259694292628452210902668841497576334155492113558125461655807827347011581400600834576213313038998784327065371995670957084738578609264918885837873923916555426357730129224364160406255173689233563656885436585164620782187574172436452581414348763276134175270737675492227628778226476515431534158571377352273033540337636420425803425726474968621782366695135341067737842113137113198737322289180527506281227771641249441240120712595431999174657474589258261371282555553508040414394455729599455463560848725133946293635894083209896480161958313042972096479412853938899626536892826380767716875958850221646458243094016500968879736615773356031683671038689522827094150954522274400273549925367021471599405654481384218638012879990082093357632073636940599142426371829400061374190057951309629854533074819780256830108967287380223482048886297313036968988264065790478156238977848536502569106423179573602533090876327178491118974843224686808634038396417612760578864657447228482493268744306255122050695516846466947718368191143287354481583635054814641109996014339059579976629064688129502503915092363301107607063286331739337814969338024758003505278978275575092860403942050634293932706463616103182287924815267930686274923727563185222565426600855684949772028590915093049542596747364833143723634955544890159866840836217691355965603951967042536886348236958712946252475903177681318497758827657674048255813650210364958550570325921995767533426422378372358605850940358397710347667064478864083110965030256521560746401965271699973237346523717345659551455949309816664400621159934913318013515052865184217882802634332593475585076116869770912558005618568371054085608124951940314806461871940257766328526701969838756756152469675902810686489686929331595435209768752713720161616093117425019970928968494003469624232568841066511330437741225617625865894123672817114552642389451263171783479027692117145288735295501933675921890800604863373778672818061025478257043678844950351892578749983669478590861297554308412267706095434761213371743315678379016201233723702333831641470642859218597761015823272199791506287186818675098166553774501302088033390435363977026336380909852649453262814655806554650482348642949539061325740049691288834051822293364447668385503796797580961998357580702775953596878822619465961222304454927560027495516858354258229533604283442631847806882539545074669187789776540603843251284381281131685620460861728940822965862617442076692029742793008812951985467871354862323661041321658127926715154596159435259345675744599230788920551954008231640971959125002545523750310673563974883554248044968138303067185193149133578920212360530819995202058450342349993215096263497781245665830468058182456352481462584933192619540688481844644524842948606301616947666324262523147632237110969536948382448231641039622450767540561428746826783572370489560699065279268845584451204665485337853402664664504233963848825771987495361130049421559373554521192618672147826541688560409492829005661688380763765669051074089251054916522296887867696863165251491770149990006663734454612026278070192569870622554092894519471877800430613002182828742586704874848082694857344477824407873410271082487026952383080491096048201390129402463124480015933667021265831767787975296596347257689432654043588926729395068786083062626626328739208732730254791009993211338897780781433672879144876837368646774852877773740354747287164421776782071296450627088097863792814407119250514114800490705560809722929979244147106285224702987069986922767634177351325860290890387570745436807787642238533370069208961635100923358730398654390607188095255755338036472589500730677212252807817947105648117137855745105769104432292542902414943358839609367932136169695425129973103103280443695450192984382084238312126582574059450942694277730712480217691578183572008717053877325601798713300550591137782384179164028084140962382084763739301393077842855454522236755982466625060875428487610414566136222764240591430445558085631818093523040779389161490211629240051507491406844320323036560995487862099919430656445533254713555736531851601170032155069078771675206288152788589714941032098698408304896652435103050244467993177914765910342894912905412036160169567122214080636940594030455218621287993309285623102241844636528909744464015198662318388196244482259078358591404368619301904145896269387890703498216986869693444808621399053459179282665430479820721963413475564652548314377115667845907779719651077246800029358154626764631022427900731363135252206706295112593587447313418649249728278479664458544896293290526205806524858870702087938913447608334465317093924240824932800891573131954134831182092775248688054873394331586756266612217935505119060999291137944563499562739189845902902171315570609626788167330294019846423739044509802803094897598125925205585097353743655682578031368190200715167569382728181882458754171072118080655644803912250453708942269535838219253507569283409563985926559974039131670929004399627597683037521750336087902829567306886226307772973353385368266873451903570970968732232373830049409012323927431875904652632709517840626726482889364689659321916952110636172975707437614806160133110491169227131860940414501484286642363471698289241818048436523053886455980983927383649068548082301426780314393744043180782267877949400620648915124895251654300563444837504675175420704331337248687063323756164523236048193202437759689091478337217955367699260323571518551339109840273906375328070231330175575426939620262942391094532353791012594896494181256367299296708425066759980345627345559855962851228141458255602484178330564524050845006598875598751860133586062493278448777200684229659194551653956298296059161004657890721484205486183041817560455981516808803178308026144599444467791801243214640098361067868341297487259672925878680622308011582202628901436445900230164582366670926557126455992579062230474523562557511177079151200278938097577546854612101730752279924140702630813779297190946141314580208108773812162453985876969737142588183615260506938092691771208732191500583197711332279357238507194061276129187257209940493025027774815661402132743474388196641333005263422908290640092794492480855613118344016180480135703250783632393892156764315962044261280970094410777613063890907129445639405660155924602545420477118614042015523337127050137712103457000957800938926532938572047857650877714966340300356238059575719160938217131222281046585838894350717643193997301266159142383717028440012039948588099623185947247485877658435507700693409922034037877219272837030138083814439411498497173076616296134205910501481428394970069595167693904155790285635691105554731268457149744963532055467794077518405666763722296909034612870682988710427876109009099916044382179451176362083537971616183312436443126785543555080050798612466439772413550212823802672671991498972724851298128728369748927642079286866697017725979440785815590933250855413129994658111852769165246479081911938423327589769957301209810300917100169571879161694227007952891519191252105389183853895931516740050572381740103062100438024301118797770425232807323657512960937245605368003751659616423614770933039122440975287173206797612812042802673925655730567593151264575004787575653185482582141157403047314749251191083561576573200254610968670189030764853137383291268248174118135903282662508254931321143147895335231704398905392853494664288607426837182490249809247948722663368682379958087563704080865564932190548963778554953116739793527079947045239915329753435869051410586409653451418289647443936718285271184356079928589597817654395011308884841916351667321369286083095674450280180037371645800916808297270871560918503865405343666004550498562468737602255704159580025017409536183928764345800367086495405794172008513635712716376832349313423070382127448450144052954169537438194545945653316514099099372272280101965465272622783151210346768616682613147184361002551786324795015002295369546631773958934413148148583469437452398115995466607120599779436344018507836089910894807341963393925931897394094311004211672912019972262660987192701402410580551531510010980499604414729103945103031266411472673683997331503503674274154699263316527043294067523744907505673950892967477911580086439999256481720884742925082154627985607912776861194608621034940553585013447219024454382452108928440949813271701067396647111493189678997766159548818619317690017502790178382462438787383148327950087902643399257702658800584977898462429566032127694581082434812969084097255067105473247131725499719190103955330584704072808169315862609388601914768994413767362143208360737513157437631675466647918675389657155510085062681000511982748680778059266776565410083477857102425013325339158738476102412979473675100116349897780374593002545760987067109215359711517825201428121664754303407512860024029703842861598428981660214342984908891735968219228446912303590432987723184330991418726467460755831872571313883235601580900959418253020779939764846259790188334179383092096584146357441198587829647585094305300814834182174782660377376225299770346875290351731079208322003808080921216434658681798981050427437538578678918635051771750160653182640692888325013591951717853768786588175236642153401096129576307476264807031275736578776235285905715393248457650394439049666808771189919249893389652485239553679582753061416713175791575638660600483999417954870586820920119515495203129456245131542250657485862916160652379664301017269395028229466748968174682116399679495029428401309923590127825043742819255763453321757616229275111059836827156722977862005372293231408288705874944406011623652162771755850301345147145276584186427707176996843549962025754743181199488338580675969235958062216583246409209535064835793581774290301831535129001432149551817745690838871932069776969565777175449914991143136895083616069253960646989337487094293321918560129910856447025625716350550862068924029758968471428367868473545553358347765253615657818999698306865467173644599634313646819542742049047243306467500144269750832236901308389549263706677840653132866488608012951377172084758115771949101234514177494148277358004143266733237961771696569858278583230050526588350224786805064820144457059319734338292386007260169651090325898090991283765227538149352984509941496693386281556803130698106452519270381851587264869176256323944142521611842776914506771841173571439668100561548395244315494486423838429890039982611332246896334652210469254513796927600971964533895533210558424564018744861105095911176682894271164005401050377042034605252131822804589299863790357235066510878235004334994239128523630889651098924664105633158417114288530414377228662983231897086903040030132595147677423751615884091583805915167350451913117819394342848292227230406142258207802782914807042676162930253922832108491775998420059510531216473181840949313980044407284732590260916973099815385393903128087882390294800157900800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
    }

    @Test
    @Order(1)
    public void testBothKindOfFactorialsWithZero() {
        assertEquals(BigDecimal.ONE, Factorial.factorialWithoutRecursion(0));
        assertEquals(BigDecimal.ONE, Factorial.factorialWithRecursion(0));
    }

    @Test
    @Order(3)
    public void testFactorialOfNWithRecursion() {
        for(Integer n: expectedMap.keySet()) {
            assertEquals(expectedMap.get(n), Factorial.factorialWithRecursion(n));
        }
    }

    @Test
    @Order(2)
    public void testFactorialOfNWithoutRecursion() {
        for(Integer n: expectedMap.keySet()) {
            assertEquals(expectedMap.get(n), Factorial.factorialWithoutRecursion(n));
        }
    }

}
