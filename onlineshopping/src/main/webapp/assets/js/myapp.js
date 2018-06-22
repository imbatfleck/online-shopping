$(function()
		{
			switch (menu) {
			case 'About':
				$('#about').addClass('active');
				break;
			case 'Products':
				$('#prod').addClass('active');
				break;
			case 'Contact':
				$('#cont').addClass('active');
				break;
			default:
				$('#home').addClass('active');
				break;
			}
		});