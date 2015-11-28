var intervalID = window.setInterval(callBed4Rate, 1000);

function callBed4Rate()
{
    $.ajax
    ({
        url: 'Bed4Module',
        type: 'GET',
        dataType: 'text'
    }).done(function(data) 
    {
        var values = String(data);
        var splittedValues = values.split(",");
        document.getElementById('pulse4').innerHTML = splittedValues[0];
        document.getElementById('pulseBed4').innerHTML = splittedValues[0];
        document.getElementById('breathing4').innerHTML = splittedValues[1];
        document.getElementById('bloodSystolic4').innerHTML = splittedValues[2];
        document.getElementById('bloodDiastolic4').innerHTML = splittedValues[3];
        document.getElementById('temperature4').innerHTML = splittedValues[4];
        document.getElementById('temperatureBed4').innerHTML = splittedValues[4];
    });
}
