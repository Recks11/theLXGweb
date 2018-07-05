$(document).ready(function () {

    var team = $("#team");
    var teamNation = $("#teamNation");
    var selectedTeam = $('#selectedTeam');
    var teamSelectedInHiddenInput = $('#teamSelected');


    var ENGLAND = [

        {display: "Arsenal", value: "Arsenal"},

        {display: "Chelsea", value: "Chelsea"},

        {display: "Everton", value: "Everton"},

        {display: "Liverpool", value: "Liverpool"},

        {display: "Manchester City", value: "Manchester City"},

        {display: "Manchester United", value: "Manchester United"},

        {display: "Middlesbrough", value: "Middlesbrough"},

        {display: "Southampton", value: "Southampton"},

        {display: "Tottenham Hotspur", value: "Tottenham Hotspur"},

        {display: "West Ham United", value: "West Ham United"},

        {display: "Leicester City", value: "Leicester City"},

        {display: "Sunderland", value: "Sunderland"},

        {display: "West Bromwich Albion", value: "West Bromwich Albion"},

        {display: "Watford", value: "Watford"},

        {display: "Burnley", value: "Burnley"},

        {display: "Crystal Palace", value: "Crystal Palace"},

        {display: "Stoke City", value: "Stoke City"},

        {display: "Bournemouth", value: "Bournemouth"},

        {display: "Hull City", value: "Hull City"},

        {display: "Swansea City", value: "Swansea City"}

    ];

    var FRANCE = [

        {display: "SC Bastia", value: "SC Bastia"},

        {display: "Girondins de Bordeaux", value: "Girondins de Bordeaux"},

        {display: "En Avant Guingamp", value: "En Avant Guingamp"},

        {display: "LOSC Lille", value: "LOSC Lille"},

        {display: "Olympique Lyonnais", value: "Olympique Lyonnais"},

        {display: "FC Metz", value: "FC Metz"},

        {display: "AS Monaco", value: "AS Monaco"},

        {display: "Montpellier HSC", value: "Montpellier HSC"},

        {display: "FC Nantes", value: "FC Nantes"},

        {display: "OGC Nice", value: "OGC Nice"},

        {display: "Paris Saint-Germain", value: "Paris Saint-Germain"},

        {display: "Stade Rennais", value: "Stade Rennais"},

        {display: "SM Caen", value: "SM Caen"},

        {display: "FC Lorient", value: "FC Lorient"},

        {display: "Olympique de Marseille", value: "Olympique de Marseille"},

        {display: "Angers SCO", value: "Angers SCO"},

        {display: "Toulouse FC", value: "Toulouse FC"},

        {display: "AS Saint-Étienne", value: "AS Saint-Étienne"},

        {display: "AS Nancy", value: "AS Nancy"},

        {display: "Dijon Football", value: "Dijon Football"}

    ];

    var GERMANY = [

        {display: "Bayern München", value: "Bayern München"},

        {display: "Borussia Dortmund", value: 'Borussia Dortmund'},

        {display: "Borussia M ' gladbach", value: "Borussia M ' gladbach"},

        {display: "SC Freiburg", value: "SC Freiburg"},

        {display: "Hamburger SV", value: "Hamburger SV"},

        {display: "1. FC Köln", value: "1. FC Köln"},

        {display: "Bayer 04 Leverkusen", value: "Bayer 04 Leverkusen"},

        {display: "FC Schalke 04", value: "FC Schalke 04"},

        {display: "SV Werder Bremen", value: "SV Werder Bremen"},

        {display: "Hertha BSC", value: "Hertha BSC"},

        {display: "1. FSV Mainz 05", value: "1. FSV Mainz 05"},

        {display: "VfL Wolfsburg", value: "VfL Wolfsburg"},

        {display: "Eintracht Frankfurt", value: "Eintracht Frankfurt"},

        {display: "TSG 1899 Hoffenheim", value: "TSG 1899 Hoffenheim"},

        {display: "FC Augsburg", value: "FC Augsburg"},

        {display: "SV Darmstadt 98", value: "SV Darmstadt 98"},

        {display: "FC Ingolstadt 04", value: "FC Ingolstadt 04"},

        {display: "RB Leipzig", value: "RB Leipzig"}

    ];

    var ITALY = [

        {display: "Atalanta", value: "Atalanta"},

        {display: "Inter", value: "Inter"},

        {display: "Juventus", value: "Juventus"},

        {display: "Lazio", value: "Lazio"},

        {display: "Milan", value: "Milan"},

        {display: "Napoli", value: "Napoli"},

        {display: "Roma", value: "Roma"},

        {display: "Torino", value: "Torino"},

        {display: "Udinese", value: "Udinese"},

        {display: "Bologna", value: "Bologna"},

        {display: "Chievo Vero", value: "Chievo Vero"},

        {display: "Pescara", value: "Pescara"},

        {display: "Empoli", value: "Empoli"},

        {display: "Sampdoria", value: "Sampdoria"},

        {display: "Cagliari", value: "Cagliari"},

        {display: "Palermo", value: "Palermo"},

        {display: "Fiorentina", value: "Fiorentina"},

        {display: "Genoa", value: "Genoa"},

        {display: "Crotone", value: "Crotone"},

        {display: "Sassuolo", value: "Sassuolo"}

    ];

    var SPAIN = [

        {display: "Atlético de Madrid", value: "Atlético de Madrid"},

        {display: "FC Barcelona", value: "FC Barcelona"},

        {display: "RC Deportivo", value: "RC Deportivo"},

        {display: "Real Madrid", value: "Real Madrid"},

        {display: "Athletic Club de Bilbao", value: "Athletic Club de Bilbao"},

        {display: "Real Betis Balompié", value: "Real Betis Balompié"},

        {display: "RC Celta de Vigo", value: "RC Celta de Vigo"},

        {display: "RCD Espanyol", value: "RCD Espanyol"},

        {display: "Real Sociedad", value: "Real Sociedad"},

        {display: "Real Sporting de Gijón", value: "Real Sporting de Gijón"},

        {display: "Valencia CF", value: "Valencia CF"},

        {display: "Deportivo Alavés", value: "Deportivo Alavés"},

        {display: "SD Eibar", value: "SD Eibar"},

        {display: "UD Las Palmas", value: "UD Las Palmas"},

        {display: "CA Osasuna", value: "CA Osasuna"},

        {display: "Sevilla FC", value: "Sevilla FC"},

        {display: "Villarreal CF", value: "Villarreal CF"},

        {display: "Málaga CF", value: "Málaga CF"},

        {display: "CD Leganés", value: "CD Leganés"},

        {display: "Granada CF", value: "Granada CF"}

    ];

//If parent option is changed
    teamNation.change(function () {
        var parent = $(this).val(); //get option value from parent

        switch (parent) { //using switch compare selected option and populate child
            case 'ENGLAND':
                list(ENGLAND);
                break;
            case 'FRANCE':
                list(FRANCE);
                break;
            case 'GERMANY':
                list(GERMANY);
                break;
            case 'ITALY':
                list(ITALY);
                break;
            case 'SPAIN':
                list(SPAIN);
                break;
            default: //default child option is blank
                $("#team").html('');
                break;
        }
    });


//function to populate child select box
    function list(array_list) {
        team.html(""); //reset child options
        $(array_list).each(function (i) { //populate child options

            var item = "\"" + array_list[i].value + "\"";
            team.append("<option value=" + item + ">" + array_list[i].display + "</option>");
        });
    }


    team.change(function () {

        selectedTeam.text($(this).val());
        teamSelectedInHiddenInput.val(team.val());
        console.log(selectedTeam.text());
    });

    teamNation.change(function () {

        selectedTeam.text(team.val());
        teamSelectedInHiddenInput.val(team.val());

    });

});
