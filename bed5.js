var intervalID = window.setInterval(callBed5Rate, 1000);

function callBed5Rate()
{
    $.ajax
    ({
        url: 'Bed5Module',
        type: 'GET',
        dataType: 'text'
    }).done(function(data) 
    {
        var values = String(data);
        var splittedValues = values.split(",");
        document.getElementById('pulse5').innerHTML = splittedValues[0];
        document.getElementById('pulseBed5').innerHTML = splittedValues[0];
        document.getElementById('breathing5').innerHTML = splittedValues[1];
        document.getElementById('bloodSystolic5').innerHTML = splittedValues[2];
        document.getElementById('bloodDiastolic5').innerHTML = splittedValues[3];
        document.getElementById('temperature5').innerHTML = splittedValues[4];
        document.getElementById('temperatureBed5').innerHTML = splittedValues[4];
    });
}
