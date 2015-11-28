var intervalID = window.setInterval(callBed7Rate, 1000);

function callBed7Rate()
{
    $.ajax
    ({
        url: 'Bed7Module',
        type: 'GET',
        dataType: 'text'
    }).done(function(data) 
    {
        var values = String(data);
        var splittedValues = values.split(",");
        document.getElementById('pulse7').innerHTML = splittedValues[0];
        document.getElementById('pulseBed7').innerHTML = splittedValues[0];
        document.getElementById('breathing7').innerHTML = splittedValues[1];
        document.getElementById('bloodSystolic7').innerHTML = splittedValues[2];
        document.getElementById('bloodDiastolic7').innerHTML = splittedValues[3];
        document.getElementById('temperature7').innerHTML = splittedValues[4];
        document.getElementById('temperatureBed7').innerHTML = splittedValues[4];
    });
}
