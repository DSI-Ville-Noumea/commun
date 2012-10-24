package nc.mairie.commun.technique;

import java.util.Hashtable;


public class ListeMairieMessages {
	private static Hashtable<String, String> listeMessages;

public static Hashtable<String,String> getListeMessages() {
	if (listeMessages == null) {
		listeMessages = new Hashtable<String,String>();

		//Messages d'erreur
		listeMessages.put("ERR001","Vous devez saisir le nom de l'agent");
		listeMessages.put("ERR002","L'adresse de l'agent @ doit Ãªtre saisie");
		listeMessages.put("ERR003","Vous devez saisir le code commune ou une partie de son libellÃ©");
		listeMessages.put("ERR004","Vous devez saisir le code pays ou le dÃ©butt son libellÃ©");
		listeMessages.put("ERR005","Vous devez saisir une partie du libellÃ© de la voie");
		listeMessages.put("ERR006","Vous devez choisir entre France ou Autre");
		listeMessages.put("ERR007","Le type de contact @ existe dÃ©jÃ  pour cet agent");
		listeMessages.put("ERR008","Le libellÃ© @ est obligatoire");
		listeMessages.put("ERR009","Vous devez saisir la date de l'inaptitude");
		listeMessages.put("ERR010","Vous devez saisir la durÃ©e de l'inaptitude");
		listeMessages.put("ERR011","Vous devez saisir la date de la visite mÃ©dicale");
		listeMessages.put("ERR012","Vous devez saisir la durÃ©e de la visite mÃ©dicale");
		listeMessages.put("ERR013","La durÃ©e de la visite mÃ©dicale doit Ãªtre numÃ©rique");
		listeMessages.put("ERR014","Vous devez sÃ©lectionner le radio bouton \"Noumea\"");
		listeMessages.put("ERR015","Vous devez sÃ©lectionner le radio bouton \"Autre Ville NC\"");
		listeMessages.put("ERR016","La BP doit Ãªtre de 5 caractÃ¨res maximum");
		listeMessages.put("ERR017","Pour le code postal @, la boite postale doit Ãªtre comprise entre @");
		listeMessages.put("ERR018","Quand la BP est saisie, vous devez sÃ©lectionner le code postal BP.");
		listeMessages.put("ERR019","La dÃ©signation est obligatoire");
		listeMessages.put("ERR020","Le nom patronymique est obligatoire");
		listeMessages.put("ERR021","Le prÃ©nom est obligatoire");
		listeMessages.put("ERR022","La date de naissance est obligatoire");
		listeMessages.put("ERR023","Le lieu de naissance est obligatoire");
		listeMessages.put("ERR024","La situation familiale est obligatoire");
		listeMessages.put("ERR025","Le sexe est obligatoire");
		listeMessages.put("ERR026","Le sexe et la dÃ©signation sÃ©lectionnÃ©s sont incompatibles");
		listeMessages.put("ERR027","La nationalitÃ© est obligatoire");
		listeMessages.put("ERR028","La date d'embauche est obligatoire");
		listeMessages.put("ERR029","Les zones No de compte, RIB et IntitulÃ© de compte sont obligatoires");
		listeMessages.put("ERR030","Le no de compte ou la clÃ© RIB est invalide pour ce couple banque/guichet");
		listeMessages.put("ERR031","'Autre ville NC' sÃ©lectionnÃ©, sÃ©lection obligatoire de la commune");
		listeMessages.put("ERR032","Si le numÃ©ro de la voie est saisi, sÃ©lection de la voie obligatoire");
		listeMessages.put("ERR033","'Autre ville NC' sÃ©lectionnÃ©, sÃ©lection obligatoire de l'adresse complÃ©mentaire ou de la boite postale");
		listeMessages.put("ERR034","'NoumÃ a' sÃ©lectionnÃ©, sÃ©lection obligatoire de la voie ou de l'adresse complÃ©mentaire ou de la boite postale");
		listeMessages.put("ERR035","La date de naissance doit Ãªtre antÃ rieure Ã  la date du jour");
		listeMessages.put("ERR036","La date d'embauche ne doit pas Ãªtre postÃ rieure Ã  la date du jour");
		listeMessages.put("ERR037","La date d'embauche doit Ãªtre postÃ rieure Ã  la date de naissance");
		listeMessages.put("ERR038","Si la dÃ©signation est M, le nom marital doit Ãªtre Ã  blanc");
		listeMessages.put("ERR039","Vous devez saisir soit le nÂ° de CAFAT, soit le nÂ° de RUAMM");
		listeMessages.put("ERR040","Le nÂ° CAFAT doit Ãªtre numÃ©rique et sur 6 positions.");
		listeMessages.put("ERR041","Le nÂ° de Mutuelle doit Ãªtre sur 12 positions au maximum.");
		listeMessages.put("ERR042","Le nÂ° RUAMM doit Ãªtre numÃ©rique et sur 6 positions.");
		listeMessages.put("ERR043","Le nÂ° CRE doit Ãªtre sur moins de 8 positions avec un caractÃ¨re alpha Ã  la fin.");
		listeMessages.put("ERR044","Le nÂ° IRCAFEX doit sur moins de 8 positions avec un caractÃ¨re alpha Ã  la fin.");
		listeMessages.put("ERR045","Pour un contrat de type CDD, la date de fin est obligatoire.");
		listeMessages.put("ERR046","Pour un contrat de type CDI, il n'y a pas de date de fin.");
		listeMessages.put("ERR046","Pour un contrat de type CDI, il n'y a pas de date de fin.");
		listeMessages.put("ERR047","Si le service militaire n'a pas Ã©tÃ© effectuÃ©, les zones VCAT, dÃ©butt et fin ne doivent pas Ãªtre renseignÂ°es");
		listeMessages.put("ERR048","Le nom est obligatoire");
		listeMessages.put("ERR049","Vous devez sÃ©lectionner la boite Ã  cocher 'Autre parent Mairie'");
		listeMessages.put("ERR050","La boite Ã  cocher 'Autre parent Mairie' est cochÃ©e sans sÃ©lection d'un autre agent");
		listeMessages.put("ERR051","Vous devez d'abord rechercher un agent");
		listeMessages.put("ERR052","Le code n'est pas modifiable");
		listeMessages.put("ERR053","Le code @ existe dÃ©jÃ  dans le rÃ©fÃ©rentiel.");
		listeMessages.put("ERR054","Impossible de le supprimer tant que des diplÃ´mes l'utilisent.");
		listeMessages.put("ERR055","Ce diplÃ´me existe dÃ©jÃ  dans le rÃ©fÃ©rentiel");
		listeMessages.put("ERR056","Impossible de modifier ou de supprimer ce diplome tant qu'il est affectÃ© Ã  un agents.");
		listeMessages.put("ERR057","L'IBA @ existe dÃ©jÃ  dans le rÃ©fÃ©rentiel.");
		listeMessages.put("ERR058","Les INA et INM de l'IBA @ doivent Ãªtre supÃ rieurs ou Ã gaux Ã  ceux de l'IBA @.");
		listeMessages.put("ERR059","Les INA et INM de l'IBA @ doivent Ãªtre infÃ rieurs ou Ã gaux Ã  ceux de l'IBA @.");
		listeMessages.put("ERR060","L'IBA n'est pas modifiable.");
		listeMessages.put("ERR061","Ce lien existe dÃ©jÃ  dans le rÃ©fÃ©rentiel.");
		listeMessages.put("ERR062","Un lien existe dÃ©jÃ  avec cette catÃ gorie.");
		listeMessages.put("ERR063","Le code actif doit Ãªtre A ou I.");
		listeMessages.put("ERR064","L'IBA et/ou le montant forfaitaire sont obligatoires.");
		listeMessages.put("ERR065","Ce grade ne peut Ãªtre supprimÃ  car il est le suivant d'un autre grade.");
		listeMessages.put("ERR066","Cet indice ne peut Ãªtre supprimÃ  car ll est rattachÃ  Ã  un grade.");
		listeMessages.put("ERR067","Ce grade @ est dÃ©jÃ  le suivant d'un autre grade.");
		listeMessages.put("ERR068","Un grade ne peut Ãªtre le suivant de lui mÃ me.");
		listeMessages.put("ERR069","La nouvelle carriere doit avoir un code grade diffÃ rent de la prÃ cÃ dente");
		listeMessages.put("ERR070","Le grade @ n'a pas de durÃ©e dÃ finie.");
		listeMessages.put("ERR071","Traitement impossible. Il reste @ avancement(s) prÃ©-validÃ©(s).");
		listeMessages.put("ERR072","Calcul impossible de la carriere car l'agent @ est dans une PA blocante.");
		listeMessages.put("ERR073","Calcul impossible de la carriere car l'agent @ est dans une PA (dÃ calage) sans date de fin.");
		listeMessages.put("ERR074","Aucune PA enrobant la date @ pour l'agent @ n'a Ã©tÃ© trouvÃ e.");
		listeMessages.put("ERR075","La date @ est incompatible avec la PA @ qui l'enrobe.");
		listeMessages.put("ERR076","Il n'y a aucune carriere Ã  supprimer");
		listeMessages.put("ERR077","Il n'y a aucune carriere Ã  modifier");
		listeMessages.put("ERR078","Seul le dernier avancement prÃ visionnel de l'agent peut Ãªtre modifiÃ ");
		listeMessages.put("ERR079","Seul le dernier avancement prÃ visionnel de l'agent peut Ãªtre supprimÃ ");
		listeMessages.put("ERR080","Cet avancement ne peut Ãªtre modifiÃ . Il est Ã  l'image de la derniÃ re carriÃ re de l'agent");
		listeMessages.put("ERR081","Il n'y a pas assez de carriÃ res pour le calcul");
		listeMessages.put("ERR082","Aucun avancement trouvÃ  pour l'agent @.");
		listeMessages.put("ERR083","Tous les avancements de l'agent @ ne sont pas prÃ -validÃ s.");
		listeMessages.put("ERR084","Les carriÃ res de l'agent @ ont Ã©tÃ© modifiÃ es. Impossible de valider ses avancements.");

			
		listeMessages.put("ERR984","La zone @ est obligatoire");
		listeMessages.put("ERR985","Le champ @ doit Ãªtre O ou N.");
		listeMessages.put("ERR986","L'objet @ avec le code @ existe dÃ ja dans le rÃ©fÃ©rentiel");
		listeMessages.put("ERR987","L'objet @ avec le code @ n'existe pas dans le rÃ©fÃ©rentiel");
		listeMessages.put("ERR988","L'attribut @ est invalide");
		listeMessages.put("ERR989","Suppression impossible. Il existe au moins @ rattachÃ  Ã  @.");
		listeMessages.put("ERR990","La date @ doit Ãªtre infÃ rieure Ã  la date @");
		listeMessages.put("ERR991","La date @ doit Ãªtre supÃ rieure Ã  la date @");
		listeMessages.put("ERR992","La zone @ doit Ãªtre numÃ©rique");
		listeMessages.put("ERR993","La date @ est incorrecte. Elle doit Ãªtre au format date.");
		listeMessages.put("ERR994","La date est incorrecte. Elle doit Ãªtre au format date.");
		listeMessages.put("ERR995","En suppression, aucune zone n'est modifiable.");
		listeMessages.put("ERR996","Il n'y a pas d'action en cours.");
		listeMessages.put("ERR997","Aucun Ã lÃ ment n'est sÃ©lectionnÃ© dans la liste des @.");
		listeMessages.put("ERR998","Aucun rÃ sultat trouvÃ .");
		listeMessages.put("ERR999","Le paramÃªtre @ est incorrect.");
			
		//Messages d'information
		listeMessages.put("INF001","Agent @ crÃ Ã ");
		listeMessages.put("INF002","Aucun agent trouvÃ ");
		listeMessages.put("INF003","Agent @ modifiÃ ");
		listeMessages.put("INF004","Calcul impossible de la carriere car le grade suivant de @ n'est pas dÃ fini");
		listeMessages.put("INF005","Calcul impossible de la carriere car l'IBA du grade @ n'est pas dÃ fini");
		listeMessages.put("INF006","Le batch de calcul des avancements est en cours d'exÃ cution.");
		listeMessages.put("INF007","Calcul impossible car le grade n'est pas dÃ fini");
	}
	return listeMessages;
}
}
