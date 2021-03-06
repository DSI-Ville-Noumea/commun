package nc.mairie.commun.technique;

import java.util.Hashtable;


public class ListeMairieMessages {
	private static Hashtable<String, String> listeMessages;

public static Hashtable<String,String> getListeMessages() {
	if (listeMessages == null) {
		listeMessages = new Hashtable<String,String>();

		//Messages d'erreur
		listeMessages.put("ERR001","Vous devez saisir le nom de l'agent");
		listeMessages.put("ERR002","L'adresse de l'agent @ doit être saisie");
		listeMessages.put("ERR003","Vous devez saisir le code commune ou une partie de son libellé");
		listeMessages.put("ERR004","Vous devez saisir le code pays ou le début son libellé");
		listeMessages.put("ERR005","Vous devez saisir une partie du libellé de la voie");
		listeMessages.put("ERR006","Vous devez choisir entre France ou Autre");
		listeMessages.put("ERR007","Le type de contact @ existe déjà  pour cet agent");
		listeMessages.put("ERR008","Le libellé @ est obligatoire");
		listeMessages.put("ERR009","Vous devez saisir la date de l'inaptitude");
		listeMessages.put("ERR010","Vous devez saisir la durée de l'inaptitude");
		listeMessages.put("ERR011","Vous devez saisir la date de la visite médicale");
		listeMessages.put("ERR012","Vous devez saisir la durée de la visite médicale");
		listeMessages.put("ERR013","La durée de la visite médicale doit être numérique");
		listeMessages.put("ERR014","Vous devez sélectionner le radio bouton \"Noumea\"");
		listeMessages.put("ERR015","Vous devez sélectionner le radio bouton \"Autre Ville NC\"");
		listeMessages.put("ERR016","La BP doit être de 5 caractères maximum");
		listeMessages.put("ERR017","Pour le code postal @, la boite postale doit être comprise entre @");
		listeMessages.put("ERR018","Quand la BP est saisie, vous devez sélectionner le code postal BP.");
		listeMessages.put("ERR019","La désignation est obligatoire");
		listeMessages.put("ERR020","Le nom patronymique est obligatoire");
		listeMessages.put("ERR021","Le prénom est obligatoire");
		listeMessages.put("ERR022","La date de naissance est obligatoire");
		listeMessages.put("ERR023","Le lieu de naissance est obligatoire");
		listeMessages.put("ERR024","La situation familiale est obligatoire");
		listeMessages.put("ERR025","Le sexe est obligatoire");
		listeMessages.put("ERR026","Le sexe et la désignation sélectionnés sont incompatibles");
		listeMessages.put("ERR027","La nationalité est obligatoire");
		listeMessages.put("ERR028","La date d'embauche est obligatoire");
		listeMessages.put("ERR029","Les zones No de compte, RIB et Intitulé de compte sont obligatoires");
		listeMessages.put("ERR030","Le no de compte ou la clé RIB est invalide pour ce couple banque/guichet");
		listeMessages.put("ERR031","'Autre ville NC' sélectionné, sélection obligatoire de la commune");
		listeMessages.put("ERR032","Si le numéro de la voie est saisi, sélection de la voie obligatoire");
		listeMessages.put("ERR033","'Autre ville NC' sélectionné, sélection obligatoire de l'adresse complémentaire ou de la boite postale");
		listeMessages.put("ERR034","'Nouméa' sélectionné, sélection obligatoire de la voie ou de l'adresse complémentaire ou de la boite postale");
		listeMessages.put("ERR035","La date de naissance doit être antérieure à  la date du jour");
		listeMessages.put("ERR036","La date d'embauche ne doit pas être postérieure à  la date du jour");
		listeMessages.put("ERR037","La date d'embauche doit être postérieure à  la date de naissance");
		listeMessages.put("ERR038","Si la désignation est M, le nom marital doit être à blanc");
		listeMessages.put("ERR039","Vous devez saisir soit le n° de CAFAT, soit le n° de RUAMM");
		listeMessages.put("ERR040","Le n° CAFAT doit être numérique et sur 6 positions.");
		listeMessages.put("ERR041","Le n° de Mutuelle doit être sur 12 positions au maximum.");
		listeMessages.put("ERR042","Le n° RUAMM doit être numérique et sur 6 positions.");
		listeMessages.put("ERR043","Le n° CRE doit être sur moins de 8 positions avec un caractère alpha à la fin.");
		listeMessages.put("ERR044","Le n° IRCAFEX doit sur moins de 8 positions avec un caractère alpha à la fin.");
		listeMessages.put("ERR045","Pour un contrat de type CDD, la date de fin est obligatoire.");
		listeMessages.put("ERR046","Pour un contrat de type CDI, il n'y a pas de date de fin.");
		listeMessages.put("ERR046","Pour un contrat de type CDI, il n'y a pas de date de fin.");
		listeMessages.put("ERR047","Si le service militaire n'a pas été effectué, les zones VCAT, début et fin ne doivent pas être renseignées");
		listeMessages.put("ERR048","Le nom est obligatoire");
		listeMessages.put("ERR049","Vous devez sélectionner la boite à cocher 'Autre parent Mairie'");
		listeMessages.put("ERR050","La boite à cocher 'Autre parent Mairie' est cochée sans sélection d'un autre agent");
		listeMessages.put("ERR051","Vous devez d'abord rechercher un agent");
		listeMessages.put("ERR052","Le code n'est pas modifiable");
		listeMessages.put("ERR053","Le code @ existe déjà dans le référentiel.");
		listeMessages.put("ERR054","Impossible de le supprimer tant que des diplômes l'utilisent.");
		listeMessages.put("ERR055","Ce diplôme existe déjà dans le référentiel");
		listeMessages.put("ERR056","Impossible de modifier ou de supprimer ce diplome tant qu'il est affecté à un agents.");
		listeMessages.put("ERR057","L'IBA @ existe déjà dans le référentiel.");
		listeMessages.put("ERR058","Les INA et INM de l'IBA @ doivent être supérieurs ou égaux à ceux de l'IBA @.");
		listeMessages.put("ERR059","Les INA et INM de l'IBA @ doivent être inférieurs ou égaux à ceux de l'IBA @.");
		listeMessages.put("ERR060","L'IBA n'est pas modifiable.");
		listeMessages.put("ERR061","Ce lien existe déjà  dans le référentiel.");
		listeMessages.put("ERR062","Un lien existe déjà  avec cette catégorie.");
		listeMessages.put("ERR063","Le code actif doit être A ou I.");
		listeMessages.put("ERR064","L'IBA et/ou le montant forfaitaire sont obligatoires.");
		listeMessages.put("ERR065","Ce grade ne peut être supprimé car il est le suivant d'un autre grade.");
		listeMessages.put("ERR066","Cet indice ne peut être supprimé car ll est rattaché à un grade.");
		listeMessages.put("ERR067","Ce grade @ est déjà le suivant d'un autre grade.");
		listeMessages.put("ERR068","Un grade ne peut être le suivant de lui même.");
		listeMessages.put("ERR069","La nouvelle carriere doit avoir un code grade différent de la précédente");
		listeMessages.put("ERR070","Le grade @ n'a pas de durée définie.");
		listeMessages.put("ERR071","Traitement impossible. Il reste @ avancement(s) pré-validé(s).");
		listeMessages.put("ERR072","Calcul impossible de la carriere car l'agent @ est dans une PA blocante.");
		listeMessages.put("ERR073","Calcul impossible de la carriere car l'agent @ est dans une PA (décalage) sans date de fin.");
		listeMessages.put("ERR074","Aucune PA enrobant la date @ pour l'agent @ n'a été trouvÃ e.");
		listeMessages.put("ERR075","La date @ est incompatible avec la PA @ qui l'enrobe.");
		listeMessages.put("ERR076","Il n'y a aucune carriere à supprimer");
		listeMessages.put("ERR077","Il n'y a aucune carriere à modifier");
		listeMessages.put("ERR078","Seul le dernier avancement prévisionnel de l'agent peut être modifié");
		listeMessages.put("ERR079","Seul le dernier avancement prévisionnel de l'agent peut être supprimé");
		listeMessages.put("ERR080","Cet avancement ne peut être modifié. Il est à l'image de la dernière carrière de l'agent");
		listeMessages.put("ERR081","Il n'y a pas assez de carrières pour le calcul");
		listeMessages.put("ERR082","Aucun avancement trouvé pour l'agent @.");
		listeMessages.put("ERR083","Tous les avancements de l'agent @ ne sont pas pré-validés.");
		listeMessages.put("ERR084","Les carrières de l'agent @ ont été modifiées. Impossible de valider ses avancements.");

			
		listeMessages.put("ERR984","La zone @ est obligatoire");
		listeMessages.put("ERR985","Le champ @ doit être O ou N.");
		listeMessages.put("ERR986","L'objet @ avec le code @ existe déjà dans le référentiel");
		listeMessages.put("ERR987","L'objet @ avec le code @ n'existe pas dans le référentiel");
		listeMessages.put("ERR988","L'attribut @ est invalide");
		listeMessages.put("ERR989","Suppression impossible. Il existe au moins @ rattaché à @.");
		listeMessages.put("ERR990","La date @ doit être inférieure à la date @");
		listeMessages.put("ERR991","La date @ doit être supérieure à la date @");
		listeMessages.put("ERR992","La zone @ doit être numérique");
		listeMessages.put("ERR993","La date @ est incorrecte. Elle doit être au format date.");
		listeMessages.put("ERR994","La date est incorrecte. Elle doit être au format date.");
		listeMessages.put("ERR995","En suppression, aucune zone n'est modifiable.");
		listeMessages.put("ERR996","Il n'y a pas d'action en cours.");
		listeMessages.put("ERR997","Aucun élément n'est sélectionné dans la liste des @.");
		listeMessages.put("ERR998","Aucun résultat trouvé.");
		listeMessages.put("ERR999","Le paramêtre @ est incorrect.");
			
		//Messages d'information
		listeMessages.put("INF001","Agent @ crée");
		listeMessages.put("INF002","Aucun agent trouvé");
		listeMessages.put("INF003","Agent @ modifié");
		listeMessages.put("INF004","Calcul impossible de la carriere car le grade suivant de @ n'est pas défini");
		listeMessages.put("INF005","Calcul impossible de la carriere car l'IBA du grade @ n'est pas défini");
		listeMessages.put("INF006","Le batch de calcul des avancements est en cours d'exécution.");
		listeMessages.put("INF007","Calcul impossible car le grade n'est pas défini");
	}
	return listeMessages;
}
}
