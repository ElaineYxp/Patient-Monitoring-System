var intervalID = window.setInterval(callBed8Rate, 1000);

function callBed8Rate()
{
    $.ajax
    ({
        url: 'Bed8Module',
        type: 'GET',
        dataType: 'text'
    }).done(function(data) 
    {
        var values = String(data);
        var splittedValues = values.split(",");
        document.getElementById('pulse8').innerHTML = splittedValues[0];
        document.getElementById('pulseBed8').innerHTML = splittedValues[0];
        document.getElementById('breathing8').innerHTML = splittedValues[1];
        document.getElementById('bloodSystolic8').innerHTML = splittedValues[2];
        document.getElementById('bloodDiastolic8').innerHTML = splittedValues[3];
        document.getElementById('temperature8').innerHTML = splittedValues[4];
        document.getElementById('temperatureBed8').innerHTML = splittedValues[4];
    });
}
