var intervalID = window.setInterval(callBed3Rate, 1000);

function callBed3Rate()
{
    $.ajax
    ({
        url: 'Bed3Module',
        type: 'GET',
        dataType: 'text'
    }).done(function(data) 
    {
        var values = String(data);
        var splittedValues = values.split(",");
        document.getElementById('pulse3').innerHTML = splittedValues[0];
        document.getElementById('pulseBed3').innerHTML = splittedValues[0];
        document.getElementById('breathing3').innerHTML = splittedValues[1];
        document.getElementById('bloodSystolic3').innerHTML = splittedValues[2];
        document.getElementById('bloodDiastolic3').innerHTML = splittedValues[3];
        document.getElementById('temperature3').innerHTML = splittedValues[4];
        document.getElementById('temperatureBed3').innerHTML = splittedValues[4];
    });
}
